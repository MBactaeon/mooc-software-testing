package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        // nf.find(new int[] {4, 25, 7, 9});

        // this crashes
        //Original case: OK
        //nf.find(new int[] {4, 3, 2, 1});
        
        //Sub-test 1: decimal numbers -> Not controlled
        //nf.find(new int[] {0.3, 3, 2, 1});
        
        //Sub-test 2: Equal nums -> Not controlled
        //nf.find(new int[] {1, 1, 1, 1});
        
        //Sub-test 3: String -> Not controlled
        //nf.find(new int[] {1, "2", 3, 4});

        //Sub-test 4: Null array -> Not controlled
        //nf.find(new int[] {});

        //Sub-test 5: Operations array -> OK
        nf.find(new int[] {1+5, 6-6, 5-4, 10+0});

        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());
    }
}
