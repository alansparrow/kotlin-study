open class SmartDevice constructor(val name: String, val category: String) {
    var deviceStatus = "online"
        protected set

    open val deviceType = "unknown"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    open fun turnOn() {
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }
}

class SmartTvDevice(deviceName: String, deviceCategory: String) : SmartDevice(name = deviceName, category = deviceCategory) {
    override val deviceType = "Smart TV"

    private var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
    private var channelNumber = 1
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }
    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }
    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    override fun turnOn() {
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                    "set to $channelNumber."
        )
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off.")
    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String) : SmartDevice(name = deviceName, category = deviceCategory) {
    override val deviceType = "Smart Light"

    private var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("$name turned off.")
    }
}

class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
    ) {

    var deviceTurnOnCount = 0
        private set

    fun turnOnTv() {
        deviceTurnOnCount++
        smartTvDevice.turnOn()
    }

    fun turnOffTv() {
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume() {
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTvDevice.nextChannel()
    }

    fun turnOnLight() {
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices() {
        smartLightDevice.turnOff()
        smartTvDevice.turnOff()
    }
}

fun main(args: Array<String>) {
    var smartTvDevice : SmartDevice = SmartTvDevice("Android TV","Entertainment")
    println("Device name is: ${smartTvDevice.name}")
    println("Device category is: ${smartTvDevice.category}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()

    smartTvDevice = SmartLightDevice("Google Light", "Utility")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}