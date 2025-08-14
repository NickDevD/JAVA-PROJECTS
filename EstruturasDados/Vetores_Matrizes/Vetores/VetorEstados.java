public class VetorEstados {
    String[] estados = {"AC","PE","SP","BA"};

    public VetorEstados(){
        this.estados = estados;
    }

    boolean localizado = false;
    public void localizar(String e){
        for(int i=0;i<estados.length;i++){
            if(e.equals(estados[i])){
                localizado = true;
                break;
            }
        }
        if(localizado == true){
            System.out.println("Estado localizado "+e);
        }else {
            System.out.println("Não localizado "+e);
        }
    }

    static void main() {
        VetorEstados v = new VetorEstados();

        v.localizar("SP");
    }
}
