package GoT.design;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import got.model.GoT.Character;
import got.model.GoT.Place;

/**
 * The services class used by VSM.
 */
public class Services {
    
	public String getCharacterImage(Character person) {
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		String imageName = person.getName().replaceAll(" ", "_") + ".png";
		Path imagePath = new Path("/icons/big/" + imageName);
		URL imageURL = FileLocator.find(bundle, imagePath, null);

		if (imageURL != null) {
			return "/GoT.design/" + imagePath.toString();
		}
		return "/GoT.design/icons/big/unknown.png";
	}
	
	public String getPlaceImage(Place p) {
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		String imageName = p.getName().replaceAll(" ", "_") + ".png";
		Path imagePath = new Path("/icons/big/" + imageName);
		URL imageURL = FileLocator.find(bundle, imagePath, null);

		if (imageURL != null) {
			return "/GoT.design/" + imagePath.toString();
		}
		return "/GoT.design/icons/big/Place.png";
	}
}
