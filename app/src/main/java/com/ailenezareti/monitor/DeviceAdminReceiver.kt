package com.ailenezareti.monitor

import android.app.admin.DeviceAdminReceiver as AndroidDeviceAdminReceiver
import android.content.Context
import android.content.Intent

class DeviceAdminReceiver : AndroidDeviceAdminReceiver() {
    override fun onEnabled(context: Context, intent: Intent) {
        super.onEnabled(context, intent)
    }

    override fun onDisableRequested(context: Context, intent: Intent): CharSequence {
        // İstifadəçi Device Admin-i söndürməyə çalışanda göstərilən xəbərdarlıq
        return context.getString(R.string.device_admin_warning)
    }
}
