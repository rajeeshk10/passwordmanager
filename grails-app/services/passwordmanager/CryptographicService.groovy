package passwordmanager

import grails.gorm.transactions.Transactional

import javax.crypto.Cipher
import javax.crypto.KeyGenerator
import javax.crypto.SecretKey
import java.security.SecureRandom

class CryptographicService {

    def serviceMethod() {

    }

//TODO this unit test is mandatory before pushing prod
    def  encrypt(String toEncrypt, String key){
        try{
            SecureRandom secureRandom = new SecureRandom(key.getBytes())
            KeyGenerator keyGenerator= KeyGenerator.getInstance("AES")
            keyGenerator.init(secureRandom)
            SecretKey secretKey= keyGenerator.generateKey()

            Cipher cipher=Cipher.getInstance('AES')
            cipher.init(Cipher.ENCRYPT_MODE,secretKey)
            byte[] encrypted=cipher.doFinal(toEncrypt.getBytes())
            return  encrypted
        }catch(Exception ex){
            println "exception thrown while encrypting "+ex
        }
    }

//TODO this unit test is mandatory before pushing prod
    def  decrypt(byte[] toDecrypt, String key){
        SecureRandom secureRandom = new SecureRandom(key.getBytes())
        KeyGenerator keyGenerator= KeyGenerator.getInstance("AES")
        keyGenerator.init(secureRandom)
        SecretKey secretKey= keyGenerator.generateKey()
        Cipher cipher=Cipher.getInstance('AES')
        cipher.init(Cipher.DECRYPT_MODE,secretKey)
        byte[] decrypted = cipher.doFinal(toDecrypt)

        return new String(decrypted)
    }

    def  encryptDomainFields(String field ,String secretyKey){
        encrypt(field , secretyKey)
    }

    def decryptDomainFields(byte[] field,String secretyKey){
        decrypt(field,secretyKey)
    }

}
