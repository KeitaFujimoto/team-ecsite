package jp.co.internous.sirius.model.domain;


import java.sql.Timestamp;

import jp.co.internous.sirius.model.form.UserForm;


/**
 * mst_userのドメイン
 * @author KeitaFujimoto
 *
 */
public class MstUser {
	
	private int id;
	
	private String userName;
	
	private String password;
	
	private String familyName;
	
	private String firstName;
	
	private String familyNameKana;
	
	private String firstNameKana;
	
	private byte gender;
	
	private Timestamp createdAt;
	
	private Timestamp updatedAt;
	
	
	/**
	 * コンストラクタ
	 */
	public MstUser() {}
	
	
	/**
	 * コンストラクタ
	 * @param f ユーザーフォーム
	 */
	public MstUser(UserForm f) {
		
		userName = f.getUserName();
		password = f.getPassword();
		familyName = f.getFamilyName();
		firstName = f.getFirstName();
		familyNameKana = f.getFamilyNameKana();
		firstNameKana = f.getFirstNameKana();
		gender = f.getGender();
	}
	
	
	/**
	 * IDを取得する
	 * @return ID
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * IDを設定する
	 * @param id ID
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * ユーザー名を取得する
	 * @return ユーザー名
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * ユーザー名を設定する
	 * @param userName ユーザー名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * パスワードを取得する
	 * @return パスワード
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * パスワードを設定する
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * 姓を取得する
	 * @return 姓
	 */
	public String getFamilyName() {
		return familyName;
	}
	
	/**
	 * 姓を設定する
	 * @param familyName 姓
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	/**
	 * 名を取得する
	 * @return 名
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * 名を設定する
	 * @param firstName 名
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * 姓かなを取得する
	 * @return 姓かな
	 */
	public String getFamilyNameKana() {
		return familyNameKana;
	}
	
	/**
	 * 姓かなを設定する
	 * @param familyNameKana 姓かな
	 */
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}
	
	/**
	 * 名かなを取得する
	 * @return 名かな
	 */
	public String getFirstNameKana() {
		return firstNameKana;
	}
	
	/**
	 * 名かなを設定する
	 * @param firstNameKana 名かな
	 */
	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}
	
	/**
	 * 性別を取得する
	 * @return 性別
	 */
	public byte getGender() {
		return gender;
	}
	
	/**
	 * 性別を設定する
	 * @param gender 性別
	 */
	public void setGender(byte gender) {
		this.gender = gender;
	}
	
	/**
	 * 登録日時を取得する
	 * @return 登録日時
	 */
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	
	/**
	 * 登録日時を設定する
	 * @param createdAt 登録日時
	 */
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	/**
	 * 更新日時を取得する
	 * @return 更新日時
	 */
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	
	/**
	 * 更新日時を設定する
	 * @param updatedAt 更新日時
	 */
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
