package carangoVelho;

import java.text.DecimalFormat;
import java.util.Scanner;

public class fetageExerc05Discursiva {

	public static void main(String[] args) {		
		String nomePesquisa;
		String codAluno[] = new String[5];
		String codCurso[] = new String[60];		
		int x,y,escalas, cargah=0;
		int soma1=0,soma2=0,soma3=0,soma4=0,soma5=0,soma6=0;
		boolean encontrou;
		String resp1;
				
		/*
		 * -Qual o código do aluno?
 		2036607
		-Qual o código do curso que vai fazer?
 		2
		-Quer cadastrar outro curso?
 			-Se sim: "Qual o código do curso que vai fazer?
 			-Se não: verificar se ele está com 12h de curso;
         		Se não: "Qual o código do curso que vai fazer?		 * 
		 */
		
		Scanner leia = new Scanner(System.in);			
		for (x = 0; x < codAluno.length; x++) {
			System.out.println("Digite o código do aluno: ");
			codAluno[x] = leia.nextLine();
			//2036607
			//outro for aqui
			System.out.println("Digite o código do curso: ");
			codCurso[x] = leia.nextLine();
			if(codCurso[x].equals("1")){
				cargah = cargah+10;
				soma1 = soma1+1;
			}else if(codCurso[x].equals("2")){
				cargah = cargah+7;
				soma2 = soma2+1;
			}else if(codCurso[x].equals("3")){
				cargah = cargah+3;
				soma3 = soma3+1;
			}else if(codCurso[x].equals("4")){
				cargah = cargah+4;
				soma4 = soma4+1;
			}else if(codCurso[x].equals("5")){
				cargah = cargah+4;
				soma5 = soma5+1;
			}else if(codCurso[x].equals("6")){
				cargah = cargah+2;
				soma6 = soma6+1;
			}
		//}
			//Verifica se está com 12h de cursos, se não solicitar mais um curso
			
			//	for (x = 0; x < codCurso.length; x++) {
				System.out.println("Quer cadastrar outros cursos (S) ou (N)");
				//nomePesquisa = leia.nextLine();
				resp1 = leia.nextLine();
				if (resp1.equals("N")) {
					if (cargah>=12) {
						break;					
				}else {
					//for (x = 0; x < codAluno.length; x++) {
						System.out.println("Digite o código do curso: ");					
						codCurso[x] = leia.nextLine();
						if(codCurso[x].equals("1")){
							cargah = cargah+10;
							soma1 = soma1+1;
						}else if(codCurso[x].equals("2")){
							cargah = cargah+7;
							soma2 = soma2+1;
						}else if(codCurso[x].equals("3")){
							cargah = cargah+3;
							soma3 = soma3+1;
						}else if(codCurso[x].equals("4")){
							cargah = cargah+4;
							soma4 = soma4+1;
						}else if(codCurso[x].equals("5")){
							cargah = cargah+4;
							soma5 = soma5+1;
						}else if(codCurso[x].equals("6")){
							cargah = cargah+2;
							soma6 = soma6+1;
						}						
					}
					//break;
				}
			//}
				//}
		
				//CALCULOS:
				//preco = 0.25*distancia[x];
				//tempo = (60*distancia[x])/800;
				//escalas = (int) tempo/180;
						
				//RELATÓRIO INTERMEDIÁRIO; Código do Aluno; Total de horas cadastradas				
				System.out.println("O código do aluno é: "+codAluno[x]);
				
				//Total de horas cadastradas				
				System.out.println("O total de horas cadastradas é: "+cargah);
				
				System.out.println("Relatorio final: Total de cadastros de cada curso");
				System.out.println("");					
				System.out.println("Curso 1 teve "+soma1+"cadastros.");
				System.out.println("Curso 2 teve "+soma2+"cadastros.");
				System.out.println("Curso 3 teve "+soma3+"cadastros.");
				System.out.println("Curso 4 teve "+soma4+"cadastros.");
				System.out.println("Curso 5 teve "+soma5+"cadastros.");
				System.out.println("Curso 6 teve "+soma6+"cadastros.");


	}

}
}