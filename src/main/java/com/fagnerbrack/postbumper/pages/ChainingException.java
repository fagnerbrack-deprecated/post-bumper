package com.fagnerbrack.postbumper.pages;

public class ChainingException extends Exception {
	private static final long serialVersionUID = 1;
	public ChainingException( String msg ) {
		super( msg );
	}
	public ChainingException( Throwable e ) {
		super( e );
	}
}
