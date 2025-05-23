package org.serratec.unifase.Unifase_Jogos_Negocio.utils;

import org.springframework.stereotype.Component;

@Component
public class CalcularImpostos {

    public Double determinarPercentualIcms(String setor, String porte){

        return switch (setor.toLowerCase()) {
            case "tecnologia" -> switch (porte.toLowerCase()) {
                case "pequena" -> 0.05;
                case "média" -> 0.15;
                case "grande" -> 0.18;
                default -> 0.12;
            };
            case "comércio" -> switch (porte.toLowerCase()) {
                case "pequena" -> 0.04;
                case "média" -> 0.15;
                case "grande" -> 0.18;
                default -> 0.12;
            };
            case "serviços" -> switch (porte.toLowerCase()) {
                case "pequena" -> 0.02;
                case "média" -> 0.03;
                case "grande" -> 0.04;
                default -> 0.033;
            };
            case "indústria" -> switch (porte.toLowerCase()) {
                case "pequena" -> 0.04;
                case "média" -> 0.16;
                case "grande" -> 0.20;
                default -> 0.13;
            };
            default -> 0.125;
        };
    }

    public Double determinarPercentualCmv(String setor, String porte){

        return switch (setor.toLowerCase()) {
            case "tecnologia" -> switch (porte.toLowerCase()) {
                case "pequena" -> 0.35;
                case "média" -> 0.3;
                case "grande" -> 0.25;
                default -> 0.32;
            };
            case "comércio" -> switch (porte.toLowerCase()) {
                case "pequena" -> 0.6;
                case "média" -> 0.55;
                case "grande" -> 0.5;
                default -> 0.57;
            };
            case "serviços" -> switch (porte.toLowerCase()) {
                case "pequena" -> 0.25;
                case "média" -> 0.2;
                case "grande" -> 0.15;
                default -> 0.022;
            };
            case "indústria" -> switch (porte.toLowerCase()) {
                case "pequena" -> 0.55;
                case "média" -> 0.5;
                case "grande" -> 0.45;
                default -> 0.52;
            };
            default -> 0.5;
        };

    }

    public Double determinarPercentualIrpj(String setor, String porte){

        return switch (setor.toLowerCase()) {
            case "tecnologia" -> switch (porte.toLowerCase()) {
                case "pequena" -> 0.06;
                case "média" -> 0.08;
                case "grande" -> 0.18;
                default -> 0.1;
            };
            case "comércio" -> switch (porte.toLowerCase()) {
                case "pequena" -> 0.06;
                case "média" -> 0.08;
                case "grande" -> 0.18;
                default -> 0.10;
            };
            case "serviços" -> switch (porte.toLowerCase()) {
                case "pequena" -> 0.08;
                case "média" -> 0.09;
                case "grande" -> 0.18;
                default -> 0.11;
            };
            case "indústria" -> switch (porte.toLowerCase()) {
                case "pequena" -> 0.06;
                case "média" -> 0.08;
                case "grande" -> 0.18;
                default -> 0.100;
            };
            default -> 0.5;
        };

    }

}
