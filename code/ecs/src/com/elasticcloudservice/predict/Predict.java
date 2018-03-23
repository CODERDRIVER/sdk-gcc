package com.elasticcloudservice.predict;

import com.filetool.util.LogUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Predict {

	public static String[] predictVm(String[] ecsContent, String[] inputContent) {

		/** =========do your work here========== **/

		String[] results = new String[ecsContent.length];

		List<String> history = new ArrayList<String>();

		for (int i = 1; i < ecsContent.length; i++) {

			if (ecsContent[i].contains("\t")
					&& ecsContent[i].split("\t").length == 3) {

				String[] array = ecsContent[i].split("\t");
				String uuid = array[0];
				String flavorName = array[1];
				String createTime = array[2];

				history.add(uuid + " " + flavorName + " " + createTime);
			}
		}
		//test
		LogUtil.printLog(history.get(0)+"\r\n");
		for (int i = 1; i < inputContent.length; i++) {

		}

		for (int i = 0; i < history.size(); i++) {
			results[i] = history.get(i);

		}

		return results;
	}

}
