package it.sephiroth.apps.widget.cleanclock.service;

import it.sephiroth.apps.widget.cleanclock.ClockAppWidgetProvider41;
import it.sephiroth.apps.widget.cleanclock.Constants;


public class ClockService41 extends ClockService
{
	@Override
	protected void createReceiver()
	{
		receiver = new ClockAppWidgetProvider41();
		Constants.log( getClass().getSimpleName() + "::createReceiver: " + receiver );
	}
	
	@Override
	protected void unregisterReceiver()
	{
		Constants.log( getClass().getSimpleName() + "::unregisterReceiver: " + receiver );
		unregisterReceiver( receiver );
	}
}
