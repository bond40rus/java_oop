package SaveFile.Interface;

import SaveFile.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
