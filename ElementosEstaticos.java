package intermediario ;
import ElementosEstaticos {
    int contadorElementos;
    /*Sempre que uma  nova instancia for criada o construtor é chamado*/
    
    public ElementosEstaticos() {
        contadorElementos ++;
    }
    public static void main(String[] args) {
        ElementosEstaticos e1 = new ElementosEstaticos ();
        ElementosEstaticos e2 = new ElementosEstaticos ();
        ElementosEstaticos e3 = new ElementosEstaticos ();
        
        int qtd = e1.contadorElementos + e2.contadorElementos;
            System.out.println("Qtd elementos= " +qtd);
    }
}


