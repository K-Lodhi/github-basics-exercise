package com.khushi;

@FunctionalInterface
public interface Authentication {

	boolean authentication(String username, String password);
}
