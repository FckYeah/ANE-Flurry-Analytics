package com.sticksports.nativeExtensions.flurry;

import java.util.HashMap;
import java.util.Map;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;

public class FlurryExtensionContext extends FREContext
{
	@Override
	public void dispose()
	{
	}

	@Override
	public Map<String, FREFunction> getFunctions()
	{
		Map<String, FREFunction> functionMap = new HashMap<String, FREFunction>();
		functionMap.put( "flurry_setAppVersion", new FlurrySetAppVersion() );
		functionMap.put( "flurry_getFlurryAgentVersion", new FlurryGetAgentVersion() );
		functionMap.put( "flurry_setSessionContinueSeconds", new FlurrySetSessionContinueSeconds() );
		functionMap.put( "flurry_setSecureTransportEnabled", new FlurrySetSecureTransportEnabled() );
		functionMap.put( "flurry_startSession", new FlurryStartSession() );
		functionMap.put( "flurry_endSession", new FlurryEndSession() );
		functionMap.put( "flurry_logEvent", new FlurryLogEvent() );
		functionMap.put( "flurry_logError", new FlurryLogError() );
		functionMap.put( "flurry_startTimedEvent", new FlurryStartTimedEvent() );
		functionMap.put( "flurry_endTimedEvent", new FlurryEndTimedEvent() );
		functionMap.put( "flurry_setLocation", new FlurrySetLocation() );
		functionMap.put( "flurry_setEventLoggingEnabled", new FlurrySetEventLoggingEnabled() );
		functionMap.put( "flurry_getVendorID", new FlurryGetVendorID() );
		functionMap.put( "flurry_setCrashReportingEnabled", new FlurrySetCrashReportingEnabled() );
		return functionMap;
	}

}
