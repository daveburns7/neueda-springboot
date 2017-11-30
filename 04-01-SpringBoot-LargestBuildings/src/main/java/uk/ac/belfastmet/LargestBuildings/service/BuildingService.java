package uk.ac.belfastmet.LargestBuildings.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.LargestBuildings.domain.FloorArea;
import uk.ac.belfastmet.LargestBuildings.domain.Footprint;
import uk.ac.belfastmet.LargestBuildings.domain.Volume;

@Service
public class BuildingService {

	public ArrayList<FloorArea> getFloorArea() {
		ArrayList<FloorArea> buildings = new ArrayList<FloorArea>();

		FloorArea newcenturyglobalcenter = new FloorArea("New Century Global Center", 1, "lfa1.jpg");
		buildings.add(newcenturyglobalcenter);
		FloorArea dubaiinternationalairportterminal3 = new FloorArea("Dubai International Airport Terminal 3", 2,
				"lfa2.jpg");
		buildings.add(dubaiinternationalairportterminal3);
		FloorArea abrajalbaitendowment = new FloorArea("Abraj Al-Bait Endowment", 3, "lfa3.jpg");
		buildings.add(abrajalbaitendowment);
		FloorArea centralworld = new FloorArea("CentralWorld", 4, "lfa4.jpg");
		buildings.add(centralworld);
		FloorArea aalsmeerflowerauction = new FloorArea("Aalsmeer Flower Auction", 5, "lfa5.jpg");
		buildings.add(aalsmeerflowerauction);
		FloorArea beijingcapitalinternationalairportterminal3 = new FloorArea(
				"Beijing Capital International Airport Terminal 3", 6, "lfa6.jpg");
		buildings.add(beijingcapitalinternationalairportterminal3);
		FloorArea thevenetianmacao = new FloorArea("The Venetian Macao", 7, "lfa7.jpg");
		buildings.add(thevenetianmacao);
		FloorArea sandscotaccentral = new FloorArea("Sands Cotai Central", 8, "lfa8.jpg");
		buildings.add(sandscotaccentral);
		FloorArea ciputraworldsurabaya = new FloorArea("Ciputra World Surabaya", 9, "lfa9.jpg");
		buildings.add(ciputraworldsurabaya);
		FloorArea berjayatimesssquare = new FloorArea("Berjaya Times Square", 10, "lfa10.jpg");
		buildings.add(berjayatimesssquare);

		return buildings;
	}

	public ArrayList<Footprint> getFootprint() {
		ArrayList<Footprint> buildings = new ArrayList<Footprint>();

		Footprint aalsmeerflowerauction = new Footprint("Aalsmeer Flower Auction", 1, "1_Aalsmeer Flower Auction.jpg");
		buildings.add(aalsmeerflowerauction);
		Footprint teslafactory = new Footprint("Tesla Factory", 2, "2_Tesla Factory.jpg");
		buildings.add(teslafactory);
		Footprint boeingeverettfactory = new Footprint("Boeing Everett Factory", 3, "3_Boeing Everett Factory.jpg");
		buildings.add(boeingeverettfactory);
		Footprint michelindistributioncenter = new Footprint("Michelin Distribution Center", 4,
				"4_Michelin Distribution Center.jpg");
		buildings.add(michelindistributioncenter);
		Footprint greatmosqueofmecca = new Footprint("Great Mosque of Mecca", 5, "5_Great Mosque of Mecca.jpg");
		buildings.add(greatmosqueofmecca);
		Footprint nikenorthamericalogisticscenter = new Footprint("Nike - North America Logistics Center", 6,
				"6_Nike - North America Logistics Center.jpg");
		buildings.add(nikenorthamericalogisticscenter);
		Footprint johndeerenorthamericanpartsdistributioncenter = new Footprint(
				"John Deere North American Parts Distribution Center", 7,
				"7_John Deere North American Parts Distribution Center.jpg");
		buildings.add(johndeerenorthamericanpartsdistributioncenter);
		Footprint mallofdubai = new Footprint("Mall of Dubai", 8, "8_Mall of Dubai.jpg");
		buildings.add(mallofdubai);
		Footprint mitsubishimotorsnorthamerica = new Footprint("Mitsubishi Motors North America", 9,
				"9_Mitsubishi Motors North America.jpg");
		buildings.add(mitsubishimotorsnorthamerica);
		Footprint indonesiaconventionexhibition = new Footprint("Indonesia Convention Exhibition", 10,
				"10_Indonesia Convention Exhibition.jpg");
		buildings.add(indonesiaconventionexhibition);

		return buildings;
	}

	public ArrayList<Volume> getVolume() {
		ArrayList<Volume> buildings = new ArrayList<Volume>();

		Volume boeingeverettfactory = new Volume("Boeing Everett Factory", 1, "1_Boeing_Everett_Plant.jpg");
		buildings.add(boeingeverettfactory);
		Volume greatmosqueofmecca = new Volume("Great Mosque of Mecca", 2, "2_Great_Mosque_of_Mecca.jpg");
		buildings.add(greatmosqueofmecca);
		Volume jeanluclagardèreplant = new Volume("Jean-Luc Lagardère Plant", 3, "3_Jean_Luc LAgardere Plant.jpg");
		buildings.add(jeanluclagardèreplant);
		Volume boeingcompositewingcenter = new Volume("Boeing Composite Wing Center", 4,
				"4_Boeing Composite Wing Center.jpg");
		buildings.add(boeingcompositewingcenter);
		Volume aerium = new Volume("Aerium", 5, "5_Aerium.JPG");
		buildings.add(aerium);
		Volume meyerwerftdockhalle2 = new Volume("Meyer WerftDockhalle 2", 6, "6_Meyer Werft Dockhalle 2.jpg");
		buildings.add(meyerwerftdockhalle2);
		Volume nasavehicleassemblybuilding = new Volume("NASA Vehicle Assembly Building", 7,
				"7_Vehicle Assembly Building.jpg");
		buildings.add(nasavehicleassemblybuilding);
		Volume theo2 = new Volume("The O2", 8, "8_The O2.jpg");
		buildings.add(theo2);
		Volume tescoirelanddistributioncentre = new Volume("Tesco Ireland Distribution Centre", 9,
				"9_Tesco Ireland Distribution Centre.jpg");
		buildings.add(tescoirelanddistributioncentre);
		Volume targetimportwarehouse = new Volume("Target Import Warehouse", 10, "10_Target Import Warehouse.jpg");
		buildings.add(targetimportwarehouse);

		return buildings;
	}
}
