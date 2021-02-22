package com.durlabh.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.opencsv.bean.CsvBindByName;

@Document(collection="bet")
public class Model {
    @Id
	private String id;
	@CsvBindByName
	private Long ranking;
	@CsvBindByName
	private Long seasonid;
	@CsvBindByName
	private String seasonName;
	@CsvBindByName
	private Long tournamentId;
	@CsvBindByName
	private Long tournamentRegionId;
	@CsvBindByName
	private String tournamentRegionCode;
	@CsvBindByName
	private String regionCode;
	@CsvBindByName
	private String tournamentName;
	@CsvBindByName
	private String tournamentShortName;
	@CsvBindByName
	private String firstName;
	@CsvBindByName
	private String lastName;
	
	@CsvBindByName
	private Long  playerId;
	@CsvBindByName
	private boolean isActive;
	@CsvBindByName
	private boolean isOpta;
	@CsvBindByName
	private Long teamId;
	@CsvBindByName
	private String teamName;
	@CsvBindByName
	private String playedPositions;
	@CsvBindByName
	private Long age;
	@CsvBindByName
	private Long height;
	@CsvBindByName
	private Long weight;
	@CsvBindByName
	private String positionText;
	@CsvBindByName
	private Long apps;
	@CsvBindByName
	private Long subOn;
	@CsvBindByName
	private Long minsPlayed;
	@CsvBindByName
	private double rating;
	@CsvBindByName
	private Long goal;
	@CsvBindByName
	private Long assistTotal;
	@CsvBindByName
	private  Long yellowCard;
	@CsvBindByName
	private Long redCard;
	@CsvBindByName
	private double shotsPerGame;
	@CsvBindByName
	private double serialWonPerGame;
	@CsvBindByName
	private Long manOfTheMatch;
	@CsvBindByName
    private String name;
	@CsvBindByName
    private boolean isManOfTheMatch;
	@CsvBindByName
    private String playedPostionsShort;
	@CsvBindByName
    private double passSuccess;
    public Model() {
    	
    }
	public Model(String id,Long ranking, Long seasonid, String seasonName, Long tournamentId, Long tournamentRegionId,
			String tournamentRegionCode, String regionCode, String tournamentName, String tournamentShortName,
			String firstName, String lastName, Long playerId, boolean isActive, boolean isOpta, Long teamId,
			String teamName, String playedPositions, Long age, Long height, Long weight, String positionText, Long apps,
			Long subOn, Long minsPlayed, double rating, Long goal, Long assistTotal, Long yellowCard, Long redCard,
			double shotsPerGame, double serialWonPerGame, Long manOfTheMatch, String name, boolean isManOfTheMatch,
			String playedPostionsShort, double passSuccess) {
		super();
		this.id=id;
		this.ranking = ranking;
		this.seasonid = seasonid;
		this.seasonName = seasonName;
		this.tournamentId = tournamentId;
		this.tournamentRegionId = tournamentRegionId;
		this.tournamentRegionCode = tournamentRegionCode;
		this.regionCode = regionCode;
		this.tournamentName = tournamentName;
		this.tournamentShortName = tournamentShortName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.playerId = playerId;
		this.isActive = isActive;
		this.isOpta = isOpta;
		this.teamId = teamId;
		this.teamName = teamName;
		this.playedPositions = playedPositions;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.positionText = positionText;
		this.apps = apps;
		this.subOn = subOn;
		this.minsPlayed = minsPlayed;
		this.rating = rating;
		this.goal = goal;
		this.assistTotal = assistTotal;
		this.yellowCard = yellowCard;
		this.redCard = redCard;
		this.shotsPerGame = shotsPerGame;
		this.serialWonPerGame = serialWonPerGame;
		this.manOfTheMatch = manOfTheMatch;
		this.name = name;
		this.isManOfTheMatch = isManOfTheMatch;
		this.playedPostionsShort = playedPostionsShort;
		this.passSuccess = passSuccess;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getRanking() {
		return ranking;
	}
	public void setRanking(Long ranking) {
		this.ranking = ranking;
	}
	public Long getSeasonid() {
		return seasonid;
	}
	public void setSeasonid(Long seasonid) {
		this.seasonid = seasonid;
	}
	public String getSeasonName() {
		return seasonName;
	}
	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}
	public Long getTournamentId() {
		return tournamentId;
	}
	public void setTournamentId(Long tournamentId) {
		this.tournamentId = tournamentId;
	}
	public Long getTournamentRegionId() {
		return tournamentRegionId;
	}
	public void setTournamentRegionId(Long tournamentRegionId) {
		this.tournamentRegionId = tournamentRegionId;
	}
	public String getTournamentRegionCode() {
		return tournamentRegionCode;
	}
	public void setTournamentRegionCode(String tournamentRegionCode) {
		this.tournamentRegionCode = tournamentRegionCode;
	}
	public String getRegionCode() {
		return regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	public String getTournamentName() {
		return tournamentName;
	}
	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}
	public String getTournamentShortName() {
		return tournamentShortName;
	}
	public void setTournamentShortName(String tournamentShortName) {
		this.tournamentShortName = tournamentShortName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public boolean isOpta() {
		return isOpta;
	}
	public void setOpta(boolean isOpta) {
		this.isOpta = isOpta;
	}
	public Long getTeamId() {
		return teamId;
	}
	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getPlayedPositions() {
		return playedPositions;
	}
	public void setPlayedPositions(String playedPositions) {
		this.playedPositions = playedPositions;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public Long getHeight() {
		return height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}
	public Long getWeight() {
		return weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}
	public String getPositionText() {
		return positionText;
	}
	public void setPositionText(String positionText) {
		this.positionText = positionText;
	}
	public Long getApps() {
		return apps;
	}
	public void setApps(Long apps) {
		this.apps = apps;
	}
	public Long getSubOn() {
		return subOn;
	}
	public void setSubOn(Long subOn) {
		this.subOn = subOn;
	}
	public Long getMinsPlayed() {
		return minsPlayed;
	}
	public void setMinsPlayed(Long minsPlayed) {
		this.minsPlayed = minsPlayed;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Long getGoal() {
		return goal;
	}
	public void setGoal(Long goal) {
		this.goal = goal;
	}
	public Long getAssistTotal() {
		return assistTotal;
	}
	public void setAssistTotal(Long assistTotal) {
		this.assistTotal = assistTotal;
	}
	public Long getYellowCard() {
		return yellowCard;
	}
	public void setYellowCard(Long yellowCard) {
		this.yellowCard = yellowCard;
	}
	public Long getRedCard() {
		return redCard;
	}
	public void setRedCard(Long redCard) {
		this.redCard = redCard;
	}
	public double getShotsPerGame() {
		return shotsPerGame;
	}
	public void setShotsPerGame(double shotsPerGame) {
		this.shotsPerGame = shotsPerGame;
	}
	public double getSerialWonPerGame() {
		return serialWonPerGame;
	}
	public void setSerialWonPerGame(double serialWonPerGame) {
		this.serialWonPerGame = serialWonPerGame;
	}
	public Long getManOfTheMatch() {
		return manOfTheMatch;
	}
	public void setManOfTheMatch(Long manOfTheMatch) {
		this.manOfTheMatch = manOfTheMatch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isManOfTheMatch() {
		return isManOfTheMatch;
	}
	public void setManOfTheMatch(boolean isManOfTheMatch) {
		this.isManOfTheMatch = isManOfTheMatch;
	}
	public String getPlayedPostionsShort() {
		return playedPostionsShort;
	}
	public void setPlayedPostionsShort(String playedPostionsShort) {
		this.playedPostionsShort = playedPostionsShort;
	}
	public double getPassSuccess() {
		return passSuccess;
	}
	public void setPassSuccess(double passSuccess) {
		this.passSuccess = passSuccess;
	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", ranking=" + ranking + ", seasonid=" + seasonid + ", seasonName=" + seasonName
				+ ", tournamentId=" + tournamentId + ", tournamentRegionId=" + tournamentRegionId
				+ ", tournamentRegionCode=" + tournamentRegionCode + ", regionCode=" + regionCode + ", tournamentName="
				+ tournamentName + ", tournamentShortName=" + tournamentShortName + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", playerId=" + playerId + ", isActive=" + isActive + ", isOpta=" + isOpta
				+ ", teamId=" + teamId + ", teamName=" + teamName + ", playedPositions=" + playedPositions + ", age="
				+ age + ", height=" + height + ", weight=" + weight + ", positionText=" + positionText + ", apps="
				+ apps + ", subOn=" + subOn + ", minsPlayed=" + minsPlayed + ", rating=" + rating + ", goal=" + goal
				+ ", assistTotal=" + assistTotal + ", yellowCard=" + yellowCard + ", redCard=" + redCard
				+ ", shotsPerGame=" + shotsPerGame + ", serialWonPerGame=" + serialWonPerGame + ", manOfTheMatch="
				+ manOfTheMatch + ", name=" + name + ", isManOfTheMatch=" + isManOfTheMatch + ", playedPostionsShort="
				+ playedPostionsShort + ", passSuccess=" + passSuccess + "]";
	}
	

}
