// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

enum class Stack {WEB, MOBILE, DEVOPS, GAMES, QA, DATA}

data class Usuario (var nome: String)

data class ConteudoEducacional(var nome: String, var duracao: Int, var descricao: String )

data class Formacao(val nome: String, val stack: Stack, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    
  val stack = Stack.MOBILE  
  val nivel = Nivel.AVANCADO
  val conteudos = listOf(
  	  ConteudoEducacional("Linguagem de programaçao Kotlin", 15, "modulo dedicado a introdução da linguagem kotlin"),
      ConteudoEducacional("Desenvolimento mobile nativo para Android", 8, "introdução a plataforma de desenvolvimento Android nativo"),
      ConteudoEducacional("Android e Kotlin", 16, "utilizando Kotlin para o desenvolvimento android"),	
      ConteudoEducacional("dominando o Android jetpeck", 27, "Desenvolvendo com Android Jetpack"),
  )  	
  
  val usuario = Usuario("pedro")  
  
  val  formacao = Formacao("Android developer", stack, nivel, conteudos) 
  
    print("O usuários: ${usuario.nome}")
    print(" se cadastrou no curso: ${formacao.nome}")
    print(" que faz parte da Stack: ${formacao.stack}")
    println(" de nível ${formacao.nivel}")
    println("Os conteudos deste curso são: ${formacao.conteudos}")
}