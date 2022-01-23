package com.example.demo;

import java.util.ArrayList;

public class Installed {
	public String version;
    public ArrayList<Object> used_options;
    public boolean built_as_bottle;
    public boolean poured_from_bottle;
    public ArrayList<RuntimeDependency> runtime_dependencies;
    public boolean installed_as_dependency;
    public boolean installed_on_request;
}
