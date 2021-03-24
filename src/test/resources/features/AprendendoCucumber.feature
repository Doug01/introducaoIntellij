#language: pt
  #enconding: UTF-8F
  #author: Douglas-Ferreira

  Funcionalidade: Aprendendo boas praticas do cucumber
    Aprendendo a utilizar o Runner e as tags

@Formulario
  Cenario: Navegar site aleattorio
    Dado que eu acesse um site qaulquer
    Quando navegar pelo site
    Então a pagina que eu navegar sera validada


@Navegar
    Cenario: Navegar site do Batista
      Dado que eu faça a busca por elementos
      Quando Quando eu clicar no botão submit
      Então o site vai retornar a mensagem "Você Clicou no Botão!"
