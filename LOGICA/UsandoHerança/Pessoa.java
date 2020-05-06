public class Pessoa {
   String nome; 
   String sobreNome; 
   String email; 
   String dataNascimento;
   
      public Pessoa() {
            this.nome = "Janine";
            this.sobreNome = "Tavares";
            this.email = "janine.h201@gmail.com";
            this.dataNascimento = "10/12/1996";
      }
    
      public String toString() {
          return  "##Pessoa##"
                 + "\nNome: " + nome
                + "\nSobrenome: " + sobreNome
                + "\nE-mail: " + email
                + "\nData de Nascimento: " + dataNascimento;
      }
}      