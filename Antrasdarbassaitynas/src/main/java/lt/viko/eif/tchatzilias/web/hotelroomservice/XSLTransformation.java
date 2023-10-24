package lt.viko.eif.tchatzilias.web.hotelroomservice;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class XSLTransformation {
    public static void main(String[] args) {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer htmlTransformer = transformerFactory.newTransformer(new StreamSource(new File("C:\\Users\\PC-1\\Desktop\\Antrasdarbassaitynas\\src\\main\\java\\lt\\viko\\eif\\tchatzilias\\web\\hotelroomservice\\room-to-html.xsl")));

            //XML to HTML
            htmlTransformer.transform(new StreamSource(new File("C:\\Users\\PC-1\\Desktop\\Antrasdarbassaitynas\\src\\main\\java\\lt\\viko\\eif\\tchatzilias\\web\\hotelroomservice\\input.xml")), new StreamResult(new File("C:\\Users\\PC-1\\Desktop\\Antrasdarbassaitynas\\src\\main\\java\\lt\\viko\\eif\\tchatzilias\\web\\hotelroomservice\\html.html")));

            //Load XSL-FO
            Transformer pdfTransformer = transformerFactory.newTransformer(new StreamSource(new File("C:\\Users\\PC-1\\Desktop\\Antrasdarbassaitynas\\src\\main\\java\\lt\\viko\\eif\\tchatzilias\\web\\hotelroomservice\\room-to-pdf.xsl")));

            //XML to PDF
            pdfTransformer.transform(new StreamSource(new File("C:\\Users\\PC-1\\Desktop\\Antrasdarbassaitynas\\src\\main\\java\\lt\\viko\\eif\\tchatzilias\\web\\hotelroomservice\\input.xml")), new StreamResult(new File("C:\\Users\\PC-1\\Desktop\\Antrasdarbassaitynas\\src\\main\\java\\lt\\viko\\eif\\tchatzilias\\web\\hotelroomservice\\output.pdf")));

            System.out.println("Transformations completed successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



