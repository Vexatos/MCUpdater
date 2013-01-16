package org.smbarbour.mcu.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Module {
	private String name;
	private String id;
	private String url;
	private String depends;
	private Boolean required;
	private Boolean inJar;
	private Boolean extract;
	private Boolean inRoot;
	private Boolean isDefault;
	private Boolean coreMod;
	private String md5;
	private List<ConfigFile> configs;
	
	public Module(String name, String id, String url, String depends, Boolean required, Boolean inJar, Boolean extract, Boolean inRoot, Boolean isDefault, Boolean coreMod, String md5, List<ConfigFile> configs)
	{
		this.setName(name);
		this.setId(id);
		this.setUrl(url);
		this.setDepends(depends);
		this.setRequired(required);
		this.setInJar(inJar);
		this.setIsDefault(isDefault);
		this.setExtract(extract);
		this.setInRoot(inRoot);
		this.setCoreMod(coreMod);
		this.setMD5(md5);
		if(configs != null)
		{
			this.configs = configs;
		} else {
			this.configs = new ArrayList<ConfigFile>();
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getUrl()
	{
		return url;
	}
	
	public void setUrl(String url)
	{
		this.url=url;
	}
	
	public Boolean getRequired()
	{
		return required;
	}
	
	public void setRequired(Boolean required)
	{
		this.required=required;
	}
	
	public Boolean getInJar()
	{
		return inJar;
	}
	
	public void setInJar(Boolean inJar)
	{
		this.inJar=inJar;
	}

	public Boolean getExtract() {
		return extract;
	}

	public void setExtract(Boolean extract) {
		this.extract = extract;
	}

	public Boolean getInRoot() {
		return inRoot;
	}

	public void setInRoot(Boolean inRoot) {
		this.inRoot = inRoot;
	}
	
	public String getMD5() {
		return md5;
	}
	
	public void setMD5(String md5) {
		if( md5 != null )
			this.md5 = md5.toLowerCase(Locale.ENGLISH);
	}

	public Boolean getIsDefault() {
		return isDefault;
	}
	
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public List<ConfigFile> getConfigs()
	{
		return configs;
	}
	
	public void setConfigs(List<ConfigFile> configs)
	{
		this.configs = configs;
	}

	public Boolean getCoreMod() {
		return coreMod;
	}

	public void setCoreMod(Boolean coreMod) {
		this.coreMod = coreMod;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepends() {
		return depends;
	}

	public void setDepends(String depends) {
		this.depends = depends;
	}
}

