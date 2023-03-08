package Prac6.Builder;

public class Main {
    public static void main(String[] args) {
        StandardPCBuilder stBuilder = new StandardPCBuilder();
        MicroATXPCBuilder mcBuilder = new MicroATXPCBuilder();

        Director director = new Director();
        PC pc;

        director.setBuilder(stBuilder);
        director.construct();
        pc = stBuilder.getResult();
        System.out.println(pc.getConfig());

        director.setBuilder(mcBuilder);
        director.construct();
        pc = mcBuilder.getResult();
        System.out.println(pc.getConfig());
    }
}
