public class Grid {
    int size;

    Grid(){
        size = 3;
    }

    public void display() {
        String grid = "";

        for(int i = 0; i < size; i++){
            grid += "__|__|__\n";
        }

        System.out.print(grid);
    }
}
