package net.di.producer1.controllers

import net.di.lib.interfaces.IFeature
import net.di.lib.interfaces.IType
import org.json.JSONObject

class FeatureController:IFeature {
    override fun getData(property: String, inputArg: JSONObject?): IType {
        TODO("Not yet implemented")
    }

    override fun startEvent(feature: String) {
        TODO("Not yet implemented")
    }

    override fun stopEvent(feature: String) {
        TODO("Not yet implemented")
    }
}