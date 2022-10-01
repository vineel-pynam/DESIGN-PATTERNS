class Main{
    public static void main(String[] args) {
        SingletonPattern sp = SingletonPattern.getConstructor();
        SingletonPattern sp1 = SingletonPattern.getConstructor();
        System.out.println(sp);
        System.out.println(sp1);
    }
}