package net.md_5.bungee.api;

import lombok.Getter;
import net.md_5.bungee.BetterBungee;
import net.md_5.bungee.BungeeCord;

public class ServerListAPI {
	
	@Getter
	private static ServerListAPI Instance = new ServerListAPI();

	public ServerListAPI() {}
	
	public void pinged(String ip) {
		if (!BungeeCord.getInstance().getBetterBungee().getServerlistusers().contains(ip)) {
			BungeeCord.getInstance().getBetterBungee().getServerlistusers().add(ip);
		}
	}
	
}
