<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Players:</h2>
<table>

<c:forEach items="${details}" var="detailss">
<tr>

<td>${detailss.ranking }</td>
<td>${detailss.seasonid }</td>
<td>${detailss.seasonName }</td>
<td>${detailss.tournamentId }</td>
<td>${detailss.tournamentRegionId }</td>
<td>${detailss.tournamentRegionCode }</td>
<td>${detailss.regionCode }</td>
<td>${detailss.tournamentName }</td>
<td>${detailss.tournamentShortName }</td>
<td>${detailss.firstName }</td>
<td>${detailss.lastName }</td>
<td>${detailss.playerId }</td>
<td>${detailss.isActive }</td>
<td>${detailss.isOpta }</td>
<td>${detailss.teamId }</td>
<td>${detailss.teamName }</td>
<td>${detailss.playedPositions }</td>
<td>${detailss.age }</td>
<td>${detailss.height }</td>
<td>${detailss.weight }</td>
<td>${detailss.positionText }</td>
<td>${detailss.apps }</td>
<td>${detailss.subOn }</td>
<td>${detailss.minsPlayed }</td>
<td>${detailss.rating }</td>
<td><a href="update-player?id=${modes.id}">${detailss.goal}</a></td>
<td>${detailss.assistTotal}</td>
<td>${detailss.yellowCard }</td>
<td>${detailss.redCard }</td>
<td>${detailss.shotsPerGame }</td>
<td>${detailss.serialWonPerGame }</td>
<td>${detailss.ManOfTheMatch }</td>
<td>${detailss.name }</td>
<td>${detailss.isManOfTheMatch }</td>
<td>${detailss.playedPositionsShort }</td>
<td>${detailss.passSuccess }</td>








</tr>

</c:forEach>
</table>


</body>

</html>