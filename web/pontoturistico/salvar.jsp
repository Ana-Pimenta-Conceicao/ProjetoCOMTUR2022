<%-- 
    Document   : salvarpontoturistico
    Created on : 26/10/2022, 17:00:20
    Author     : Aluno
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="br.com.contur.DAO.CidadeDAOImpl"%>
<%@page import="java.util.List"%>
<%@page import="br.com.contur.DAO.GenericDAO"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="ISO-8859-1">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>COMTUR</title>
        <!--
        Holiday Template
        http://www.templatemo.com/tm-475-holiday
        -->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,600,700' rel='stylesheet' type='text/css'>
        <link href="${pageContext.request.contextPath}/css/font-awesome.min.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/css/bootstrap-datetimepicker.min.css" rel="stylesheet">  
        <link href="${pageContext.request.contextPath}/css/flexslider.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/css/templatemo-style.css" rel="stylesheet">

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

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
                                <li><a href="${pageContext.request.contextPath}/DadosPontoTuristico">Cadastrar</a></li>
                            </ul>


                        </nav>		
                    </div>				
                </div>
            </div>	  	
        </div>		


        <!-- white bg -->
        <section class="section-padding-bottom">
            <div class="container">
                <div class="row">
                    <div class="tm-section-header section-margin-top">
                        <div class="col-lg-4 col-md-3 col-sm-3"><hr></div>
                        <div class="col-lg-4 col-md-6 col-sm-6"><h2 class="tm-section-title">Cadastrar Ponto Turistico</h2></div>
                        <div class="col-lg-4 col-md-3 col-sm-3"><hr></div>	
                    </div>				
                </div>

                <div class="row">
                    <!-- contact form -->
                    <form name="salvarpontoturistico" action="${pageContext.request.contextPath}/SalvarPontoTuristico"  method="POST">
                        <label>ID: </label><input type="number"  id="idpontoturistico" name="idpontoturistico" readonly="readonly" /><br />
                        <label>Nome: </label><input type="text"  id="nomepontoturistico" name="nomepontoturistico" required="required"/><br />
                        <label>Dados:</label><input type="text" id="emailpontoturistico" name="emailpontoturistico" /><br/>
                        <label>Descriçao</label><input type="text"  id="senhapontoturistico" name="senhapontoturistico" /><br/>            <br />
                        <label>Cidade</label><br/>
                            <select name="cidade" id="cidade" required="true">
                                <option value="">Selecione uma cidade</option>
                                <c:forEach items="${cidades}" var="cidade">
                                    <option value="${cidade.idCidade}">${cidade.nomeCidade}</option>
                                </c:forEach>
                            </select>
            <br/><br/><br/>
                        <br />
                        <input type="submit" name="salvar" value="Salvar" />
                    </form>
                    <br />
                    <h3>${resposta}</h3>
                </div>			
            </div>
        </section>
        <footer class="tm-black-bg">
            <div class="container">
                <div class="row">
                    <p class="tm-copyright-text">@Comtur</p>
                </div>
            </div>		
        </footer>
        <script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>      		<!-- jQuery -->
        <script type="text/javascript" src="js/bootstrap.min.js"></script>					<!-- bootstrap js -->
        <script type="text/javascript" src="js/jquery.flexslider-min.js"></script>			<!-- flexslider js -->
        <script type="text/javascript" src="js/templatemo-script.js"></script>      		<!-- Templatemo Script -->

    </body>
</html>