package utils;

import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

import dto.AccountDTO;

class MyCodecProvider implements CodecProvider {    
    public <T> Codec<T> get(Class<T> myClass, CodecRegistry codecRegistry) {
        if (myClass== AccountDTO.class) {
            return (Codec<T>) new MyAccountDTOImpCodec(codecRegistry);
        }
        return null;
    }
}