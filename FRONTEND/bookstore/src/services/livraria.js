import { http } from './api'

export default {

  showAll:() => {
    return http.get('livros');
  },

  store:(livro) => {
    return http.post('livros', livro);
  },

  update:(livro) => {
    return http.put(`livros/${livro.id}`, livro)
  },

  delete: (livro) => {
    return http.delete(`livros/${livro.id}`, { data: livro })
  }


}
