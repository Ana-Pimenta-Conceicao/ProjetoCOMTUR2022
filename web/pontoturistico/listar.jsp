<%-- 
    Document   : listar
    Created on : 29 de nov. de 2022, 20:29:55
    Author     : Gabriela Cristina
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Comtur</title>
        
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,600,700' rel='stylesheet' type='text/css'>
        <link href="${pageContext.request.contextPath}/css/font-awesome.min.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/css/bootstrap-datetimepicker.min.css" rel="stylesheet">  
        <link href="${pageContext.request.contextPath}/css/flexslider.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/css/templatemo-style.css" rel="stylesheet">
        
         <script type="text/javascript" >
            function confirmaExclusao(id){
                var resposta = confirm("Deseja realmente excluir esse registro?");
                if (resposta === true){
                    window.location.href = "${pageContext.request.contextPath}/ExcluirPontoTuristico?idpontoTuristico="+id;
                    }}
        </script>
        
    </head>
    <body>
        <div class="tm-header">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 col-md-4 col-sm-3 tm-site-name-container">
                        <a href="#" class="tm-site-name">COMTUR</a>	
                    </div>
                    <div class="col-lg-6 col-md-8 col-sm-9">
                        <div class="mobile-menu-icon">
                            <i class="fa fa-bars"></i>
                        </div>
                        <nav class="tm-nav">
                            <ul>
                                <li><a href="${pageContext.request.contextPath}/index.html">Início</a></li>
                                <li><a href="${pageContext.request.contextPath}/about.html">Quem Somos</a></li>
                                <li><a href="${pageContext.request.contextPath}/DadosPontoTuristico">PontoTuristico</a></li>
                            </ul>


                        </nav>		
                    </div>				
                </div>
            </div>	  	
        </div>	
                            
      <section class="section-padding-bottom">
            <div class="container">
                <div class="row">
                    <div class="tm-section-header section-margin-top">
                        <div class="col-lg-4 col-md-3 col-sm-3"><hr></div>
                        <div class="col-lg-4 col-md-6 col-sm-6"><h2 class="tm-section-title">Lista de Pontos Turisticos</h2></div>
                        <div class="col-lg-4 col-md-3 col-sm-3"><hr></div>	
                    </div>				
                </div>
        <br />
        <table align="center" border="1">
            <thead>
                <tr>
                    <h3 class="slider-subtitle">
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Descrição</th>
                    <th>Dados</th>
                    <th>Cidade</th>
                    <th colspan="2">Editar</th></h3>
                </tr>
            </thead>
            <tbody> 
                 <c:forEach var="pontoTuristico" items="${pontoTuristico}">
                    <tr>
                        <td>${pontoTuristico.idPontoTuristico}</td>
                        <td>${pontoTuristico.nomePontoTuristico}</td>
                        <td>${pontoTuristico.descricaoPontoTuristico}</td>
                        <td>${pontoTuristico.dadoPontoTuristico}</td>
                        <td>${pontoTuristico.idCidadePontoTuristico}</td>
                        <td><a href="javascript:func()" onclick="confirmaExclusao(${pontoTuristico.idPontoTuristico})" >Excluir</a></td>
                        <td><a href="${pageContext.request.contextPath}/CarregarPontoTuristico?idpontoTuristico=${pontoTuristico.idPontoTuristico}">Alterar</td>
                       
                            
                    </tr>
                </c:forEach>
                 <br/> <br/> <br/>
                 <h3 class="slider-subtitle"><a href="${pageContext.request.contextPath}/index.html">Página Inicial</a></h3>
                 <h3 class="slider-subtitle"><a href="${pageContext.request.contextPath}/DadosPontoTuristico">Cadastrar Ponto Turistico</a></li></h3>
            </tbody>
        </table>
        
    </body>
</html>
