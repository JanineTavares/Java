<template>
  <div id="app">
      <nav>
        <div class="nav-wrapper purple light-1">

          <a href="#" class="brand-logo center p-text text-darken-15">Livraria ComBook</a>
        </div>

      </nav>


      <div class="container">


      <form @submit.prevent="salvar">
        <div>
          <input type="text" id="name" placeholder="Digite um titulo" v-model="livro.name">
        </div>
        <div>
          <input type="text" id="author" placeholder="Digite um autor" v-model="livro.author">
        </div>
        <div>
          <button class="btn waves-effect waves-light" type="submit" name="action">Adicionar Livro</button>
        </div>

      </form>

      <h3>Quantidade de livros cadastrados: {{livros.length}}</h3>
      <h4 v-show="livros.length ==0 ">Oops nada aqui:( </h4>
      <table v-show="livros.length > 0">
        <thead>
          <tr>
            <th>Código</th>
            <th>Título</th>
            <th>Autor</th>
            <th>Excluir</th>
            <th>Alterar</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="livro in livros" :key="livro.name">
            <td>{{livro.id}}</td>
            <td>{{livro.name}}</td>
            <td>{{livro.author}}</td>
            <td>
              <button class="btn waves-effect waves-light" type="submit" name="action" @click="deleteLivro(livro)"> Excluir </button>
            </td>
            <td>

              <button class="btn waves-effect waves-light" type="submit" name="action" @click="updateLivro(livro)"> Alterar</button>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>

<script>
import livraria from './services/livraria'

export default {
    data() {
      return {
        livro: {
          id:'',
          name:'',
          author:''
        },
        livros: [],

      }
    },
    mounted() {
      this.listLivros();
    },
    methods: {
      listLivros() {
        livraria.showAll().then(response => {
          this.livros = response.data
        })
      },
      salvar() {


          livraria.store(this.livro).then(response => {
             alert("Adicionado com sucesso!");
            this.livro = {};
            this.listLivros();
            return response;
          })
        },

      alterar() {
          livraria.updateLivro(this.livro).then(response => {
            alert("Alterado com sucesso!");
            this.livro = {};
            this.listLivros();
            return response;
          })
        },

      deleteLivro(livro) {
        if(confirm("Deseja excluir este livro!")) {
          livraria.delete(livro).then(response => {
            alert("Excluido com sucesso!");
            this.listLivros();
            return response;
          })
        }
      },
      updateLivro(livro) {
        this.livro = livro;
      }
    }
}
</script>

<style>

.btn {
  color: rgba(#f0e117, 0.4);
  background-color: rgb(54, 16, 116);
}


#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
}

</style>
