module com.Consumer {
	requires com.Service.Provider;
	requires transitive java.logging;
}