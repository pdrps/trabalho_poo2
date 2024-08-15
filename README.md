Conversar com o professor sobre a relação dos arquivos com o banco "como fazer, qual ferramenta usar..."

Apresenta os seguintes erros:

"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.2.5\lib\idea_rt.jar=49944:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.2.5\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Pedro\IdeaProjects\trabalhojava\target\classes Main
java.sql.SQLException: No suitable driver found for jdbc:mysql://localhost:3306/nome_do_banco
	at java.sql/java.sql.DriverManager.getConnection(DriverManager.java:708)
	at java.sql/java.sql.DriverManager.getConnection(DriverManager.java:230)
	at ConexaoBD.<init>(ConexaoBD.java:15)
	at ConexaoBD.getInstance(ConexaoBD.java:23)
	at AutorDAO.inserirAutor(AutorDAO.java:9)
	at Main.main(Main.java:15)
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.sql.Connection.prepareStatement(String)" because "conn" is null
	at AutorDAO.inserirAutor(AutorDAO.java:10)
	at Main.main(Main.java:15)

 
