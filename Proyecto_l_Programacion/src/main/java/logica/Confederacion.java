
package logica;

public class Confederacion {
        private String[] AFC = {"Afganistán", "Arabia Saudí", "Australia", "Bahréin", "Bangladesh", "Brunéi Darussalam", "Bután ", "Camboya", "Chinese Taipei", "Emiratos Árabes Unidos", "Filipinas",
            "Guam", "Hong Kong China", "India ", "Indonesia", "Irak", "Japón", "Jordania", "Kuwait", "Laos", "Líbano", "Macao", "Malasia", "Maldivas", "Mongolia", "Myanmar", "Nepal", "Omán", "Pakistán",
            "Palestina", "Qatar", "RDP de Corea", "República de Corea", "República Kirguisa", "Rl de Irán", "RP China", "Singapur", "Siria", "Sri Lanka", "Tailandia", "Tayikistán", "Timor Oriental",
            "Turkmenistán", "Uzbekistán", "Vietnam", "Yemen"};

    private String[] CAF = {"Angola", "Argelia", "Benín", "Botsuana", "Botsuana", "Burkina Faso", "Burundi", "Cabo Verde", "Camerún", "Chad", "Comoras", "Congo", "Costa de Marfil", "Egipto", "Eritrea",
            "Esuatini", "Etiopía", "Gabón", "Gambia", "Ghana", "Guinea", "Guinea Ecuatorial", "Guinea-Bissáu", "Kenia", "Lesoto", "Liberia", "Libia", "Madagascar", "Malaui", "Mali", "Marruecos", "Mauricio",
            "Mauritania", "Mozambique", "Namibia", "Níger", "Nigeria", "RD del Congo", "República Centroafricana", "Ruanda", "Santo Tomé y Príncipe", "Senegal", "Seychelles", "Sierra Leona", "Somalia",
            "Sudáfrica", "Sudán", "Sudán del Sur", "Tanzania", "Togo", "Túnez", "Uganda", "Yibuti", "Zambia"};

    private String[] CONMEBOL = {"Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Ecuador", "Paraguay", "Perú", "Uruguay", "Venezuela"};

    private String[] OFC = {"Fiyi", "Islas Cook", "Islas Salomón", "Nueva Caledonia", "Nueva Zelanda", "Papúa Nueva Guinea", "Samoa", "Samoa Americana", "Tahití", "Tonga", "Vanuatu", "islas Kiribati", "Tuvalu"};

    private String[] UEFA = {"Albania", "Alemania", "Andorra", "Armenia", "Austria", "Azerbaiyán", "Bélgica", "Bielorrusia", "Bosnia y Herzegovina", "Bulgaria", "Chipre", "Croacia", "Dinamarca",
            "Escocia" + "Eslovaqui", "Eslovenia", "España", "Estonia", "Finlandia", "Francia", "Gales", "Georgia", "Gibraltar", "Hungría", "Inglaterra", "Irlanda", "Irlanda del Norte",
            "Islandia", "Islas Feroe", "Israel", "Italia", "Kazajistán", "Kosovo", "Letonia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Malta", "Moldavia", "Montenegro", "Noruega", "Paises Bajos",
            "Polonia", "Portugal", "Republica Checa", "Rumania", "Rusia", "San Marino", "Serbia", "Suecia", "Suiza", "Turquia", "Ucrania"};

    private String[] CONCACAF = {"Costa Rica", "El Salvador", "Haití", "Honduras", "Jamaica", "Panamá", "República Dominicana", "Trinidad y Tobago"};

    public String[] getAFC() {
        return AFC;
    }

    public String[] getCAF() {
        return CAF;
    }

    public String[] getCONMEBOL() {
        return CONMEBOL;
    }

    public String[] getOFC() {
        return OFC;
    }

    public String[] getUEFA() {
        return UEFA;
    }

    public String[] getCONCACAF() {
        return CONCACAF;
    }
}
