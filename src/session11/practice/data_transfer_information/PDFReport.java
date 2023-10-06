package session11.practice.data_transfer_information;

import java.util.Random;

public class PDFReport extends Report implements PdfExportable {
    @Override
    public void exportToPdf() {

    }

    @Override
    public void showPreview() {

    }

    @Override
    public void displayMetadata() { // its not mandatory to override this method
        super.displayMetadata();
    }
}
