class Main{
    public static void main(String args[]){
        Directory movieDirectory = new Directory("Movies");

        Directory thrillerDirectory = new Directory("Thriller-Movies");

        File rrr = new File("RRR");
        File psycho = new File("PYSCHO");
        thrillerDirectory.add(rrr);
        thrillerDirectory.add(psycho);
        
        movieDirectory.add(thrillerDirectory);

        Directory actionMovies = new Directory("Action-Movies");
        File war = new File("WAR");
        File kgf = new File("KGF");
        actionMovies.add(war);
        actionMovies.add(kgf);

        movieDirectory.add(actionMovies);

        movieDirectory.ls();
    }
}