package com.testin.java10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import net.glxn.qrgen.core.image.ImageType;
import net.glxn.qrgen.core.scheme.VCard;
import net.glxn.qrgen.javase.QRCode;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException {
        QRCode.from("Hello World")
              .to(ImageType.JPG)
              .writeTo(new FileOutputStream("hello.jpg"));
        QRCode.from("Hello QRCode")
              .withColor(0xFFFF0000,
                         0xFFFFFFAA)
              .writeTo(new FileOutputStream("qrcode.jpg"));
        VCard johnDoe = new VCard("John Doe").setEmail("john.doe@example.org")
                                             .setAddress("John Doe Street 1, 5678 Doestown")
                                             .setTitle("Mister")
                                             .setCompany("John Doe Inc.")
                                             .setPhoneNumber("1234")
                                             .setWebsite("www.example.org");
        QRCode.from(johnDoe)
              .withCharset("UTF-8")
              .withSize(640,
                        640)
              .writeTo(new FileOutputStream("vcard.jpg"));
    }
}
