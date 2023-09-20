package Practice;


import com.aspose.words.*;
import com.aspose.words.Font;

import java.awt.*;

public class CreateFirstDoc {
    // Create a Document object
    // Create a DocumentBuilder object
    String path = "D:\\";
    String name = "TienTN";
    String address = "Ha Noi";
    String phone = "0123456789";

    private double debt = 450.55;

    private String currency = "USD";
        public CreateFirstDoc() throws Exception {
// Create a Document object
            Document doc = new Document();
// Create a DocumentBuilder object
            DocumentBuilder builder = new DocumentBuilder(doc);
// Specify font formatting
            Font font = builder.getFont();
            font.setSize(18);
            font.setBold(true);
            font.setColor(Color.BLACK);
            font.setName("Arial");

            ParagraphFormat heading = builder.getParagraphFormat();
            heading.setAlignment(ParagraphAlignment.CENTER);
            builder.writeln("Personal Information");
// Start the paragraph
            font.setSize(12);
            font.setBold(false);
            ParagraphFormat paragraphFormat = builder.getParagraphFormat();
            paragraphFormat.setFirstLineIndent(12);
            paragraphFormat.setKeepTogether(true);
            paragraphFormat.setAlignment(ParagraphAlignment.LEFT);
            // write Ho va ten black color
            // change color to red and write name
            builder.insertBreak(BreakType.LINE_BREAK);
            builder.write("Họ và tên: ");
            font.setColor(Color.RED);
            builder.write(name);
            //line break
            builder.insertBreak(BreakType.LINE_BREAK);

            font.setColor(Color.BLACK);
            builder.write("Địa chỉ: ");
            font.setColor(Color.RED);
            builder.write(address);

            builder.insertBreak(BreakType.LINE_BREAK);

            font.setColor(Color.BLACK);
            builder.write("Số điện thoại: ");
            font.setColor(Color.RED);
            builder.write(phone);

            builder.insertBreak(BreakType.LINE_BREAK);
            font.setColor(Color.BLACK);
            builder.write("Số tiền nợ: ");
            font.setColor(Color.RED);
            builder.write(String.format("%s %s", debt, currency));
// Save the document
            doc.save(path + "Rich Word Document.docx");
            doc.save(path + "Rich Word Document.pdf");

    }

}
