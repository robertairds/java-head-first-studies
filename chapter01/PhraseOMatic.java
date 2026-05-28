package chapter01;

	import java.util.Random; // Importação necessária para o gerador de números aleatórios

	public class PhraseOMatic {
	    public static void main (String[] args) {
	        
	        // 1. Crie três conjuntos de palavras que serão selecionadas. Adicione as palavras que bem entender!
	        String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven", "extensible", "reactive", "agent based", "functional", "AI enabled", "strongly typed"};
	        
	        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven", "pub-sub", "IoT", "cloudnative", "service oriented", "containerized", "serverless", "microservices", "distributed ledger"};
	        
	        String[] wordListThree = {"framework", "library", "DSL", "REST API", "repository", "pipeline", "servicemesh", "architecture", "perspective", "design", "orientation"};
	        
	        // 2. Descubra quantas palavras estão em cada lista
	        int oneLength = wordListOne.length;
	        int twoLength = wordListTwo.length;
	        int threeLength = wordListThree.length;
	        
	        // 3. Gere três números aleatórios
	        java.util.Random randomGenerator = new java.util.Random();
	        int rand1 = randomGenerator.nextInt(oneLength);
	        int rand2 = randomGenerator.nextInt(twoLength);
	        int rand3 = randomGenerator.nextInt(threeLength);
	        
	        // 4. Crie uma frase
	        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
	        
	        // 5. Exiba a frase
	        System.out.println("We need a " + phrase);
	    }
	}

