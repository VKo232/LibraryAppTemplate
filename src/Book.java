/**
 * Book class
 */
public class Book {
    
    String title;
    String author;
    String[] pages;

    /**
     * censorPage(int) : void
     * Will replace the contents of any given pageNumber with a hyphen "-", thereby
     * 'censoring' its contents from being viewed.
     *
     * @param pageNumber
     *          The index of the page to be 'censored'
     *
     */

    public void censorPage(int pageNumber){
        this.pages[pageNumber] = "-";
    }





    /**
     * toString() : String
     * Returns all this.pages values as one long string.
     *
     * @return
     *          String of all page contents together.
     *          E.g. if this.pages = { "a", "b", "c" };
     *          the method returns "abc".
     */

    public String toString(){
        String total = "";
        for (int i = 0; i < this.pages.length; i++){
            total += this.pages[i];
        }

        return total;
    }


}
