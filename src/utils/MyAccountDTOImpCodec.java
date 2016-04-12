package utils;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecRegistry;

import digester.Account;
import digester.Customer;
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
        String iBAN = reader.readString("IBAN");
        String firstName = reader.readString("customerFirstName");
        String lastName = reader.readString("customerLastName");
        double balance = reader.readDouble("balance");
        String currency = reader.readString("currency");
        long customerId = reader.readInt64("customerId");
        
        
        
        reader.readEndDocument();
        Account account = new Account(iBAN, balance, currency);
        Customer customer = new Customer(firstName, lastName, customerId, account);
        AccountDTO doc = new AccountDTO(account, customer);
        return doc;
    }

}