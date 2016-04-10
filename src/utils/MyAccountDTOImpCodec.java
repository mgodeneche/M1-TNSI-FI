package utils;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecRegistry;

import dto.AccountDTO;

// the Codec extends two interfaces: Encoder<T>, Decoder<T>
class MyAccountDTOImpCodec implements Codec<AccountDTO> {

    private CodecRegistry codecRegistry;

    public MyAccountDTOImpCodec(CodecRegistry codecRegistry) {
        this.codecRegistry = codecRegistry;
    }

    public void encode(BsonWriter writer, AccountDTO doc, EncoderContext encoderContext) {
        writer.writeStartDocument();
        writer.writeName("IBAN");
        writer.writeString(doc.getIBAN());
        writer.writeName("customerFirstName");
        writer.writeString(doc.getCustomerFirstName());
        writer.writeName("customerLastName");
        writer.writeString(doc.getCustomerLastName());
        writer.writeEndDocument();
    }

    public Class<AccountDTO> getEncoderClass() {
        return AccountDTO.class;
    }

    public AccountDTO decode(BsonReader reader, DecoderContext decoderContext) {
        reader.readStartDocument();
        String id = reader.readString("IBAN");
        String firstName = reader.readString("customerFirstName");
        String lastName = reader.readString("customerLastName");
        reader.readEndDocument();

        AccountDTO doc = new AccountDTO();
        doc.setIBAN(id);
        doc.setCustomerFirstName(firstName);
        doc.setCustomerFirstName(lastName);
        return doc;
    }

}