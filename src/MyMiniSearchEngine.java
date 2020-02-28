import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MyMiniSearchEngine {
    // default solution. OK to change.
    // do not change the signature of index()
    private Map<String, List<List<Integer>>> indexes;

    // disable default constructor
    private MyMiniSearchEngine() {
    }

    public MyMiniSearchEngine(List<String> documents) {
        index(documents);
    }

    // each item in the List is considered a document.
    // assume documents only contain alphabetical words separated by white spaces.
    //this should assign each keyword or search to it's own unique index maybe use ArrayDictionary for this?
    private void index(List<String> texts) {
        //homework
        ArrayDictionary test = new ArrayDictionary(texts.size());
        test.add(1, texts.size()); // Maybe implement a math.rand for the indexes?

        List<String> text_lower; // the new list of strings shoudld take the texts and place them to lower value
    }

    // search(key) return all the document ids where the given key phrase appears.
    // key phrase can have one or two words in English alphabetic characters.
    // return an empty list if search() finds no match in all documents.
    // DON'T USE STRING COMPARISON TO SCAN EACH DOC TO DO SEARCHES UNLESS YOU WANT TO LOSE 50 PTS!
    // Remember that this can search either a single word such as "Hello" or a phrase >=2 words such as "Hello world"
    public List<Integer> search(String keyPhrase) {
        // homework\
        if(keyPhrase == null){
            return new ArrayList<>(); // if they don't search anything then nothing will be returned except for an empty arrayList
        }

        return new ArrayList<>(); // place holder
    }
}
