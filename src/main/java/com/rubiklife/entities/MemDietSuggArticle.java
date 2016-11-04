package com.rubiklife.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mem_diet_sugg_articles database table.
 * 
 */
@Entity
@Table(name="mem_diet_sugg_articles")
@NamedQuery(name="MemDietSuggArticle.findAll", query="SELECT m FROM MemDietSuggArticle m")
public class MemDietSuggArticle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="mem_diet_sugg_articles_id")
	private int memDietSuggArticlesId;

	@Column(name="artcile_desc")
	private String artcileDesc;

	@Column(name="article_header")
	private String articleHeader;

	@Lob
	@Column(name="article_upload")
	private byte[] articleUpload;

	@Column(name="article_url")
	private String articleUrl;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="article_valid_from")
	private Date articleValidFrom;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="article_valid_to")
	private Date articleValidTo;

	@Column(name="dietitian_id")
	private int dietitianId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updt")
	private Date lastUpdt;

	@Column(name="last_updt_user")
	private String lastUpdtUser;

	@Column(name="member_id")
	private int memberId;

	public MemDietSuggArticle() {
	}

	public int getMemDietSuggArticlesId() {
		return this.memDietSuggArticlesId;
	}

	public void setMemDietSuggArticlesId(int memDietSuggArticlesId) {
		this.memDietSuggArticlesId = memDietSuggArticlesId;
	}

	public String getArtcileDesc() {
		return this.artcileDesc;
	}

	public void setArtcileDesc(String artcileDesc) {
		this.artcileDesc = artcileDesc;
	}

	public String getArticleHeader() {
		return this.articleHeader;
	}

	public void setArticleHeader(String articleHeader) {
		this.articleHeader = articleHeader;
	}

	public byte[] getArticleUpload() {
		return this.articleUpload;
	}

	public void setArticleUpload(byte[] articleUpload) {
		this.articleUpload = articleUpload;
	}

	public String getArticleUrl() {
		return this.articleUrl;
	}

	public void setArticleUrl(String articleUrl) {
		this.articleUrl = articleUrl;
	}

	public Date getArticleValidFrom() {
		return this.articleValidFrom;
	}

	public void setArticleValidFrom(Date articleValidFrom) {
		this.articleValidFrom = articleValidFrom;
	}

	public Date getArticleValidTo() {
		return this.articleValidTo;
	}

	public void setArticleValidTo(Date articleValidTo) {
		this.articleValidTo = articleValidTo;
	}

	public int getDietitianId() {
		return this.dietitianId;
	}

	public void setDietitianId(int dietitianId) {
		this.dietitianId = dietitianId;
	}

	public Date getLastUpdt() {
		return this.lastUpdt;
	}

	public void setLastUpdt(Date lastUpdt) {
		this.lastUpdt = lastUpdt;
	}

	public String getLastUpdtUser() {
		return this.lastUpdtUser;
	}

	public void setLastUpdtUser(String lastUpdtUser) {
		this.lastUpdtUser = lastUpdtUser;
	}

	public int getMemberId() {
		return this.memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

}