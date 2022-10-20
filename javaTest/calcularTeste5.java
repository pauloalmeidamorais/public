package javaTest;
// Ignore it. Estou simplesmente fazendo um teste meu aqui.
public class calcularTeste5 {

	double mediaHomem = 0;
	int qtdHomem = 0;
	double somaIdadeHomem = 0;
	double mediaMulher = 0;
	int qtdMulher = 0;
	double somaIdadeMulher = 0;
	double qtdMediaIdades;

	public double calcularIdadeMediaHomens(int idadeHomem) {

		qtdHomem++;

		somaIdadeHomem = somaIdadeHomem + idadeHomem;

		mediaHomem = somaIdadeHomem / qtdHomem;

		return mediaHomem;

	}

	public double calcularIdadeMediaMulheres(int idadeMulher) {

		qtdMulher++;

		somaIdadeMulher = somaIdadeMulher + idadeMulher;

		mediaMulher = somaIdadeMulher / qtdMulher;

		return mediaMulher;
	}

	public double calcularIdadeMediaGrupo(double mediaHomem, double mediaMulher) {
		double media = mediaMulher + mediaHomem;
		return media / 2;
		}
	}