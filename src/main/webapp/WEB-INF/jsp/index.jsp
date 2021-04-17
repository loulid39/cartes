<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
table, th, td {
  border: 1px solid black;
}
</style>
 <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script type="text/javascript">
var Coeur = "&hearts;";
var Pique = " &spades; ";
var Trèfle = "&clubs;";
var Carreaux = "&diams;";

function lancerEssai(){
	$.get("test", function(data, status){
		$('#result').show('slow');
		$('#colorsTable tbody').empty();
		$('#valuesTable tbody').empty();
		$('#carteNOrded').empty();
		$('#carteOrded').empty();
		
		data.colorOrder.forEach(c => {
			$('#colorsTable tbody').append('<td>'+c+'</td>');
		});
		
		data.valueOrder.forEach(v => {
			$('#valuesTable tbody').append('<td>'+v+'</td>');
		});
		$('#carteNOrded').append('<tr><th>:.Couleur.:</th><th>:.Valeur.:</th></tr>');
		data.nonOrderedCartes.forEach(can =>{
			$('#carteNOrded').append('<tr><td>'+can.couleur+'</td><td>'+can.valeur+'</td></tr>');
		});
		$('#carteOrded').append('<tr><th>:.Couleur.:</th><th>:.Valeur.:</th></tr>');
		data.orderedCartes.forEach(ca =>{
			$('#carteOrded').append('<tr><td>'+ca.couleur+'</td><td>'+ca.valeur+'</td></tr>');
		});
	});
	
}
</script>
<title>ATEXO</title>

</head>
<body>
<h2>Appuez sur *Lancer* pour tester la solution</h2>
<input type="button" value="*Lancer*" onclick="lancerEssai()">
<div id="result" hidden>
<h3>Ordre des couleurs : </h3>
<div id="colors">
	<table id="colorsTable">
		<tr></tr>
	</table>
</div>

<h3>Ordre des valeurs : </h3>
<div id="values">
	<table id="valuesTable">
		<tr></tr>
	</table>
</div>
<br>
<table>
<tr>
<td>
<h3>Cartes non ordonnées</h3>
<div id="carteNOrded">
	<table id="carteNorededTable"></table>
</div>
</td>
<td>
<h3>Cartes ordonnées</h3>
<div id="carteOrded">
	<table id="carteOrededTable"></table>
</div>
</td>
</tr>
</table>
</div>
</body>
</html>