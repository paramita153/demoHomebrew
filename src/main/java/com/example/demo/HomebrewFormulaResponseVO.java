package com.example.demo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HomebrewFormulaResponseVO {
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getTap() {
		return tap;
	}
	public void setTap(String tap) {
		this.tap = tap;
	}
	public Object getOldname() {
		return oldname;
	}
	public void setOldname(Object oldname) {
		this.oldname = oldname;
	}
	public ArrayList<Object> getAliases() {
		return aliases;
	}
	public void setAliases(ArrayList<Object> aliases) {
		this.aliases = aliases;
	}
	public ArrayList<Object> getVersioned_formulae() {
		return versioned_formulae;
	}
	public void setVersioned_formulae(ArrayList<Object> versioned_formulae) {
		this.versioned_formulae = versioned_formulae;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public Versions getVersions() {
		return versions;
	}
	public void setVersions(Versions versions) {
		this.versions = versions;
	}
	public Urls getUrls() {
		return urls;
	}
	public void setUrls(Urls urls) {
		this.urls = urls;
	}
	public int getRevision() {
		return revision;
	}
	public void setRevision(int revision) {
		this.revision = revision;
	}
	public int getVersion_scheme() {
		return version_scheme;
	}
	public void setVersion_scheme(int version_scheme) {
		this.version_scheme = version_scheme;
	}
	public Bottle getBottle() {
		return bottle;
	}
	public void setBottle(Bottle bottle) {
		this.bottle = bottle;
	}
	public boolean isKeg_only() {
		return keg_only;
	}
	public void setKeg_only(boolean keg_only) {
		this.keg_only = keg_only;
	}
	public Object getKeg_only_reason() {
		return keg_only_reason;
	}
	public void setKeg_only_reason(Object keg_only_reason) {
		this.keg_only_reason = keg_only_reason;
	}
	public boolean isBottle_disabled() {
		return bottle_disabled;
	}
	public void setBottle_disabled(boolean bottle_disabled) {
		this.bottle_disabled = bottle_disabled;
	}
	public ArrayList<Object> getOptions() {
		return options;
	}
	public void setOptions(ArrayList<Object> options) {
		this.options = options;
	}
	public ArrayList<String> getBuild_dependencies() {
		return build_dependencies;
	}
	public void setBuild_dependencies(ArrayList<String> build_dependencies) {
		this.build_dependencies = build_dependencies;
	}
	public ArrayList<String> getDependencies() {
		return dependencies;
	}
	public void setDependencies(ArrayList<String> dependencies) {
		this.dependencies = dependencies;
	}
	public ArrayList<Object> getRecommended_dependencies() {
		return recommended_dependencies;
	}
	public void setRecommended_dependencies(ArrayList<Object> recommended_dependencies) {
		this.recommended_dependencies = recommended_dependencies;
	}
	public ArrayList<Object> getOptional_dependencies() {
		return optional_dependencies;
	}
	public void setOptional_dependencies(ArrayList<Object> optional_dependencies) {
		this.optional_dependencies = optional_dependencies;
	}
	public ArrayList<Object> getUses_from_macos() {
		return uses_from_macos;
	}
	public void setUses_from_macos(ArrayList<Object> uses_from_macos) {
		this.uses_from_macos = uses_from_macos;
	}
	public ArrayList<Object> getRequirements() {
		return requirements;
	}
	public void setRequirements(ArrayList<Object> requirements) {
		this.requirements = requirements;
	}
	public ArrayList<Object> getConflicts_with() {
		return conflicts_with;
	}
	public void setConflicts_with(ArrayList<Object> conflicts_with) {
		this.conflicts_with = conflicts_with;
	}
	public Object getCaveats() {
		return caveats;
	}
	public void setCaveats(Object caveats) {
		this.caveats = caveats;
	}
	public ArrayList<Installed> getInstalled() {
		return installed;
	}
	public void setInstalled(ArrayList<Installed> installed) {
		this.installed = installed;
	}
	public String getLinked_keg() {
		return linked_keg;
	}
	public void setLinked_keg(String linked_keg) {
		this.linked_keg = linked_keg;
	}
	public boolean isPinned() {
		return pinned;
	}
	public void setPinned(boolean pinned) {
		this.pinned = pinned;
	}
	public boolean isOutdated() {
		return outdated;
	}
	public void setOutdated(boolean outdated) {
		this.outdated = outdated;
	}
	public boolean isDeprecated() {
		return deprecated;
	}
	public void setDeprecated(boolean deprecated) {
		this.deprecated = deprecated;
	}
	public Object getDeprecation_date() {
		return deprecation_date;
	}
	public void setDeprecation_date(Object deprecation_date) {
		this.deprecation_date = deprecation_date;
	}
	public Object getDeprecation_reason() {
		return deprecation_reason;
	}
	public void setDeprecation_reason(Object deprecation_reason) {
		this.deprecation_reason = deprecation_reason;
	}
	public boolean isDisabled() {
		return disabled;
	}
	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	public Object getDisable_date() {
		return disable_date;
	}
	public void setDisable_date(Object disable_date) {
		this.disable_date = disable_date;
	}
	public Object getDisable_reason() {
		return disable_reason;
	}
	public void setDisable_reason(Object disable_reason) {
		this.disable_reason = disable_reason;
	}
	public Analytics getAnalytics() {
		return analytics;
	}
	public void setAnalytics(Analytics analytics) {
		this.analytics = analytics;
	}
	public AnalyticsLinux getAnalyticsLinux() {
		return analyticsLinux;
	}
	public void setAnalyticsLinux(AnalyticsLinux analyticsLinux) {
		this.analyticsLinux = analyticsLinux;
	}
	public String getGenerated_date() {
		return generated_date;
	}
	public void setGenerated_date(String generated_date) {
		this.generated_date = generated_date;
	}
	public String name;
	    public String full_name;
	    public String tap;
	    public Object oldname;
	    public ArrayList<Object> aliases;
	    public ArrayList<Object> versioned_formulae;
	    public String desc;
	    public String license;
	    public String homepage;
	    public Versions versions;
	    public Urls urls;
	    public int revision;
	    public int version_scheme;
	    public Bottle bottle;
	    public boolean keg_only;
	    public Object keg_only_reason;
	    public boolean bottle_disabled;
	    public ArrayList<Object> options;
	    public ArrayList<String> build_dependencies;
	    public ArrayList<String> dependencies;
	    public ArrayList<Object> recommended_dependencies;
	    public ArrayList<Object> optional_dependencies;
	    public ArrayList<Object> uses_from_macos;
	    public ArrayList<Object> requirements;
	    public ArrayList<Object> conflicts_with;
	    public Object caveats;
	    public ArrayList<Installed> installed;
	    public String linked_keg;
	    public boolean pinned;
	    public boolean outdated;
	    public boolean deprecated;
	    public Object deprecation_date;
	    public Object deprecation_reason;
	    public boolean disabled;
	    public Object disable_date;
	    public Object disable_reason;
	    public Analytics analytics;
	    @JsonProperty("analytics-linux") 
	    public AnalyticsLinux analyticsLinux;
	    public String generated_date;

}
