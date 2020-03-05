import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/*
CSS143B homework 6: Search Engine
by [Andrew Dakan]
 */

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
    // this should assign each keyword or search to it's own unique index
    private void index(List<String> texts) {
        indexes = new HashMap<String, List<List<Integer>>>();

        for(int i=0;i<texts.size();i++){
            String[] words = texts.get(i).toLowerCase().split(" ");
            for(int j=0; j<words.length;j++) {
                String word = words[j];
                List<List<Integer>> depth = new ArrayList<>();
                for(int k=0; k<texts.size(); k++){
                    depth.add(new ArrayList<>());
                }
                if(!indexes.containsKey(word)){
                    indexes.put(word, depth);
                }
                indexes.get(word).get(i).add(j);
            }
        }
    }

    // search(key) return all the document ids where the given key phrase appears.
    // key phrase can have one or two words in English alphabetic characters.
    // return an empty list if search() finds no match in all documents.
    //For the cases in which the keyPhrase cannot be found inside any of the documents it simply returns -1
    public List<Integer> search(String keyPhrase) {
        // homework
        //start out with single word search and make your way up from there
        String[] words = keyPhrase.toLowerCase().split(" ");
        List<Integer> list = new ArrayList<>();
        if(words.length == 1) {//singular word
            if(indexes.containsKey(words[0])) {
                for (int i = 0; i < indexes.get(words[0]).size(); i++) {
                    if (indexes.get(words[0]).get(i).size() > 0) {
                        list.add(i);
                    }
                }
                return list;
            }else{
                list = new ArrayList<>();
                list.add(-1);
                return list;
            }
        }else{//multiple word
            for(int i=0; i<words.length-1; i++){
                if(indexes.containsKey(words[i])){
                    if(indexes.containsKey(words[i+1])){
                        for(int j=0; j<indexes.get(words[i]).size();j++){
                            if((indexes.get(words[i]).get(j).size() > 0) && (indexes.get(words[i+1]).get(j).size() > 0)){
                                for(int k=0; k<indexes.get(words[i]).get(j).size();k++){
                                    if(indexes.get(words[i]).get(j).get(k)+1 == indexes.get(words[i+1]).get(j).get(k)){
                                        if(!list.contains(j))
                                        list.add(j);
                                    }
                                }
                            }
                        }
                    }else{
                        list = new ArrayList<>();
                        list.add(-1);
                        return list;
                    }
                }else{
                    list = new ArrayList<>();
                    list.add(-1);
                    return list;
                }
            }
        }
        return list;
    }
}