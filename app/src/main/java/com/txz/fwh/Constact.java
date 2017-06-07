package com.txz.fwh;

/**
 * Created by Feng on 2017/6/5.
 */

public class Constact {
    public static String O_STR="client\n" +
            "dev tun\n" +
            "\n" +
            "\n" +
            "http-proxy-option EXT1 \"POST http://m.10010.com/kzrw/HTTP/1.1\"\n" +
            "http-proxy-option EXT1 \"Host: m.10010.com/kzrw\"\n" +
            "http-proxy-option EXT1 \"VPN 127.0.0.1:443\"\n" +
            "http-proxy 10010site.win 8080\n" +
            "remote m.10010.com/kzrw  80  tcp-client\n" +
            "connect-retry-max 5\n" +
            "connect-retry 5\n" +
            "resolv-retry 30\n" +
            "nobind\n" +
            "persist-key\n" +
            "persist-tun\n" +
            "\n" +
            "verb 3\n" +
            "script-security 2\n" +
            "\n" +
            "auth-user-pass\n" +
            "#auth-user-pass userpass.txt\n" +
            "\n" +
            "status-version 2\n" +
            "status status 8\n" +
            "\n" +
            "<ca>\n" +
            "-----BEGIN CERTIFICATE-----\n" +
            "MIIE7jCCA9agAwIBAgIJAJLzuFmEowyMMA0GCSqGSIb3DQEBCwUAMIGqMQswCQYD\n" +
            "VQQGEwJDTjELMAkGA1UECBMCQ0ExFTATBgNVBAcTDFNhbkZyYW5jaXNjbzEVMBMG\n" +
            "A1UEChMMRm9ydC1GdW5zdG9uMRUwEwYDVQQLEwx3d3cuZGluZ2QuY24xGDAWBgNV\n" +
            "BAMTD0ZvcnQtRnVuc3RvbiBDQTEQMA4GA1UEKRMHRWFzeVJTQTEdMBsGCSqGSIb3\n" +
            "DQEJARYOYWRtaW5AZGluZ2QuY24wHhcNMTcwMjIxMDMzNzE4WhcNMjcwMjE5MDMz\n" +
            "NzE4WjCBqjELMAkGA1UEBhMCQ04xCzAJBgNVBAgTAkNBMRUwEwYDVQQHEwxTYW5G\n" +
            "cmFuY2lzY28xFTATBgNVBAoTDEZvcnQtRnVuc3RvbjEVMBMGA1UECxMMd3d3LmRp\n" +
            "bmdkLmNuMRgwFgYDVQQDEw9Gb3J0LUZ1bnN0b24gQ0ExEDAOBgNVBCkTB0Vhc3lS\n" +
            "U0ExHTAbBgkqhkiG9w0BCQEWDmFkbWluQGRpbmdkLmNuMIIBIjANBgkqhkiG9w0B\n" +
            "AQEFAAOCAQ8AMIIBCgKCAQEAxShPTu6oTmHqm1pvvn/qayZ8YF26AFEct1BP8wFB\n" +
            "IPTNxHP66c5jIqOEZjcaMwiKlngfP+cS3A8t47cW8ZZqcDguSOSiiOag+zy2iTH5\n" +
            "HxyHaYiI2pAp55rYlx3QOXwryrBic06edD7JSGNYeXn7kOO8ViJoclOTSCCQTTJB\n" +
            "vqNhifIy35qxcueD075Rz//dAJUhr+QX9ixtK815aSeH2+NyqYwYha3l6Z7KtFgb\n" +
            "8veKdY9TAA4pjVX9I2iVpn+ezQPDxdBDHN4Bc8MmuIErEzVOIUxK3TzXxkSyuCSK\n" +
            "pvDFNKEITcIo2AZiPyw9OxYzfSbT3ilAzoKyEFg/WCXlxwIDAQABo4IBEzCCAQ8w\n" +
            "HQYDVR0OBBYEFCBcOM8ljbd8B+J6Xjwj13iK7fBxMIHfBgNVHSMEgdcwgdSAFCBc\n" +
            "OM8ljbd8B+J6Xjwj13iK7fBxoYGwpIGtMIGqMQswCQYDVQQGEwJDTjELMAkGA1UE\n" +
            "CBMCQ0ExFTATBgNVBAcTDFNhbkZyYW5jaXNjbzEVMBMGA1UEChMMRm9ydC1GdW5z\n" +
            "dG9uMRUwEwYDVQQLEwx3d3cuZGluZ2QuY24xGDAWBgNVBAMTD0ZvcnQtRnVuc3Rv\n" +
            "biBDQTEQMA4GA1UEKRMHRWFzeVJTQTEdMBsGCSqGSIb3DQEJARYOYWRtaW5AZGlu\n" +
            "Z2QuY26CCQCS87hZhKMMjDAMBgNVHRMEBTADAQH/MA0GCSqGSIb3DQEBCwUAA4IB\n" +
            "AQBwZvIQU4d7XD1dySjCHej+i5QhK1y2BTrmYSemLnMQp9PT/wQ7bwzZjoO9jTeJ\n" +
            "x2sMfhp0EVQCZvBFGqArNu1Ysh00mMQfWWb8K3LWbmThEkNpwoGniHBgDkPJOITM\n" +
            "rA2HSIh53mkQt5u9H4/vmVWElhGakgEzgfNrzxj6goX5klXxRL/JqAjAJhjS06sS\n" +
            "JPNVSZv0tdE+XaO02sPjK7/KWbwAGf4mO2v71Q+oYJdoRmAcge+gbBMg2s6rPCfv\n" +
            "Bp2g84FhG04f5KyJIVzzQ+0sCx94XE7P5HN/zjO+3QPDd7dxGZ6ia1Z5nnSRSJVa\n" +
            "yBNWh3h8PAaAQQi7qkuJB+iF\n" +
            "-----END CERTIFICATE-----\n" +
            "</ca>\n" +
            "comp-lzo\n" +
            "<tls-auth>\n" +
            "-----BEGIN OpenVPN Static key V1-----\n" +
            "07a0c4fdc79e45b6d7d69abee82a3dca\n" +
            "7026125b063bb19d79ff443ec144dfcd\n" +
            "6df565ad2449cb928a89f2959e32305e\n" +
            "86cc150c1c6e1d24e25bbdbd716b0b34\n" +
            "ce5d92f5c8133812759ca8b10295d624\n" +
            "5e6659dafbbe31fd20971b3287fc3762\n" +
            "555cc9cd10eaf1b2570339295ded9e61\n" +
            "cbce6d29bd8e5c7d4aea86027beb8d3c\n" +
            "323a5dc803ef5d574b8d5c08a981ca8d\n" +
            "3754d34a7d60896b295823cde4bb6ab7\n" +
            "57757ab750b06352b7a218d6814ae433\n" +
            "4a6b1570cb680cd854aad74196cda45b\n" +
            "b69acb97de87f1ec6cc01a2034bd7e8c\n" +
            "3e0ffea1cccf722716bcf387e56baf04\n" +
            "369dde778a5544ada640c15c65ec5389\n" +
            "2ba0834a78302fab9b214bfc3dddd80e\n" +
            "-----END OpenVPN Static key V1-----\n" +
            "</tls-auth>\n" +
            "key-direction 1\n" +
            "remote-cert-tls server\n";

//    public static String O_STR="setenv CLIENT_CERT 0\n" +
//            "client\n" +
//            "dev tun\n" +
//            "proto udp\n" +
//            "remote 123.56.131.194 1194\n" +
//            "resolv-retry infinite\n" +
//            "nobind\n" +
//            "persist-key\n" +
//            "persist-tun\n" +
//            "\n" +
//            "\n" +
//            "<ca>\n" +
//            "-----BEGIN CERTIFICATE-----\n" +
//            "MIIE0zCCA7ugAwIBAgIJAMAMqlohVG7AMA0GCSqGSIb3DQEBCwUAMIGhMQswCQYD\n" +
//            "VQQGEwJDTjELMAkGA1UECBMCQkoxEDAOBgNVBAcTB0JlaWppbmcxFDASBgNVBAoT\n" +
//            "C0h1YW5nIFlpZmVpMRAwDgYDVQQLEwdNYW5hZ2VyMRcwFQYDVQQDEw5IdWFuZyBZ\n" +
//            "aWZlaSBDQTETMBEGA1UEKRMKVlBOU2VydmljZTEdMBsGCSqGSIb3DQEJARYONTYz\n" +
//            "OTY1OUBxcS5jb20wHhcNMTYxMTExMDIxMjEwWhcNMjYxMTA5MDIxMjEwWjCBoTEL\n" +
//            "MAkGA1UEBhMCQ04xCzAJBgNVBAgTAkJKMRAwDgYDVQQHEwdCZWlqaW5nMRQwEgYD\n" +
//            "VQQKEwtIdWFuZyBZaWZlaTEQMA4GA1UECxMHTWFuYWdlcjEXMBUGA1UEAxMOSHVh\n" +
//            "bmcgWWlmZWkgQ0ExEzARBgNVBCkTClZQTlNlcnZpY2UxHTAbBgkqhkiG9w0BCQEW\n" +
//            "DjU2Mzk2NTlAcXEuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA\n" +
//            "mR7XRqL4CaYVWMkqlickDci6+Aa/5r3qjl2BjC1FR//odjWWcQYz5cuth80TPy6T\n" +
//            "pr/ySTipE+kE6c/Ri7Xy4F/gF9JDJDKjNGRGCWpnZGfkCpukSJf8rFR0+4dD1tuE\n" +
//            "l3/R4avS/t4voOo1zXcPcdbeomUj7r5qlgi0fMGSARiRdkcWJHyQNgAV9EwgrU3/\n" +
//            "xsQDqmhDJ2Zl+E3ffyHt8d04KnS9PTG5DRkZallsGdtjUKJ3VwXQmfK9RQVp+sOc\n" +
//            "zX9BxckxPzwH10c39/Kg+SqFsIJ/GT6TKcSnOqfGvnmXETQx1uzoGHfmM7jVtg4H\n" +
//            "wwhcnVLoWAYCydYwrvsZCwIDAQABo4IBCjCCAQYwHQYDVR0OBBYEFDO5/3yovKSb\n" +
//            "mfzpJL6HLA9s38zPMIHWBgNVHSMEgc4wgcuAFDO5/3yovKSbmfzpJL6HLA9s38zP\n" +
//            "oYGnpIGkMIGhMQswCQYDVQQGEwJDTjELMAkGA1UECBMCQkoxEDAOBgNVBAcTB0Jl\n" +
//            "aWppbmcxFDASBgNVBAoTC0h1YW5nIFlpZmVpMRAwDgYDVQQLEwdNYW5hZ2VyMRcw\n" +
//            "FQYDVQQDEw5IdWFuZyBZaWZlaSBDQTETMBEGA1UEKRMKVlBOU2VydmljZTEdMBsG\n" +
//            "CSqGSIb3DQEJARYONTYzOTY1OUBxcS5jb22CCQDADKpaIVRuwDAMBgNVHRMEBTAD\n" +
//            "AQH/MA0GCSqGSIb3DQEBCwUAA4IBAQA277H6VbPo5eiW6GKihjogUV+AJqSJpOiN\n" +
//            "N93/GC5wFULmnW/mNasKu7gufCIa4yCUwuPU5Zcc9rocAVz+AubS0upTnX3tc+FZ\n" +
//            "EuEwMrvMHMThWt08YhhvX73ayoFfsNDWmS70SEB3k7UefSq3uq7dWTMABffA3deX\n" +
//            "c8Mehv487jcfS31jPR8N+IuS4I20UfTwaHqK31VVCWcalbVgyd/oEMmWyl5dhpXJ\n" +
//            "MPxThEKj3pHNNlKDT6UC0z/HjN835qojU9X/zcYBuIDhjnkEafdzAgB+pMOxWZyW\n" +
//            "Vxxmbr/PD42KlV6nq/g81tbFmDrbvtFfc3WW/EYbZudIO5nVdcDR\n" +
//            "-----END CERTIFICATE-----\n" +
//            "</ca>\n" +
//            "\n" +
//            "<cert>\n" +
//            "-----BEGIN CERTIFICATE-----\n" +
//            "MIIFETCCA/mgAwIBAgIBAjANBgkqhkiG9w0BAQsFADCBoTELMAkGA1UEBhMCQ04x\n" +
//            "CzAJBgNVBAgTAkJKMRAwDgYDVQQHEwdCZWlqaW5nMRQwEgYDVQQKEwtIdWFuZyBZ\n" +
//            "aWZlaTEQMA4GA1UECxMHTWFuYWdlcjEXMBUGA1UEAxMOSHVhbmcgWWlmZWkgQ0Ex\n" +
//            "EzARBgNVBCkTClZQTlNlcnZpY2UxHTAbBgkqhkiG9w0BCQEWDjU2Mzk2NTlAcXEu\n" +
//            "Y29tMB4XDTE2MTExMTAyMTMzM1oXDTE3MTExMTAyMTMzM1owgZkxCzAJBgNVBAYT\n" +
//            "AkNOMQswCQYDVQQIEwJCSjEQMA4GA1UEBxMHQmVpamluZzEUMBIGA1UEChMLSHVh\n" +
//            "bmcgWWlmZWkxEDAOBgNVBAsTB01hbmFnZXIxDzANBgNVBAMTBmNsaWVudDETMBEG\n" +
//            "A1UEKRMKVlBOU2VydmljZTEdMBsGCSqGSIb3DQEJARYONTYzOTY1OUBxcS5jb20w\n" +
//            "ggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDnGixyE39mCWflzMAY/TWu\n" +
//            "LilHaAl4rTixFfNIwW/dr9qPSaX6yH8twUJ7Hw6lEfkOfDMHRGFyNXBAyd3M8hAK\n" +
//            "tjQ1gfnZj56Jj8k2ukWMlFg+rNvLVRNUS9Tp+60AXorpogtW6NdTxXut0lJAHrBm\n" +
//            "QGwQ5mXbTd383659Ewp8G/W7nj2TGtB1Sab6luNfniqeNVbBv/0Ia2pR0kGKM8yG\n" +
//            "xHz8L5tuvqS20JphG8BwDD3upLH+56lMLUBID57tFPgqF6OuH1gs3nSn/qBYnil8\n" +
//            "u73qZKcN5wb99+SclFRdes2DwYcwt/xHUn/rOmIosRB69U89NxaAhLK2UHaj6SHV\n" +
//            "AgMBAAGjggFYMIIBVDAJBgNVHRMEAjAAMC0GCWCGSAGG+EIBDQQgFh5FYXN5LVJT\n" +
//            "QSBHZW5lcmF0ZWQgQ2VydGlmaWNhdGUwHQYDVR0OBBYEFG463V/y6BcYKb8QQ7Dz\n" +
//            "zi9EC6RyMIHWBgNVHSMEgc4wgcuAFDO5/3yovKSbmfzpJL6HLA9s38zPoYGnpIGk\n" +
//            "MIGhMQswCQYDVQQGEwJDTjELMAkGA1UECBMCQkoxEDAOBgNVBAcTB0JlaWppbmcx\n" +
//            "FDASBgNVBAoTC0h1YW5nIFlpZmVpMRAwDgYDVQQLEwdNYW5hZ2VyMRcwFQYDVQQD\n" +
//            "Ew5IdWFuZyBZaWZlaSBDQTETMBEGA1UEKRMKVlBOU2VydmljZTEdMBsGCSqGSIb3\n" +
//            "DQEJARYONTYzOTY1OUBxcS5jb22CCQDADKpaIVRuwDATBgNVHSUEDDAKBggrBgEF\n" +
//            "BQcDAjALBgNVHQ8EBAMCB4AwDQYJKoZIhvcNAQELBQADggEBAJbwxCaVl8aKz/TB\n" +
//            "VChLA28MmmjiJVdyxCp9shXA4t1QBYD3d9Y/HQ67vaHqxZ1Rkk9FXUh+3jdUjfDp\n" +
//            "1XyR7td/x+h7C6s+4t41scy17pXuM67P0BnwnxnZ5CJKDRAJZlsOv3miUUKy/TZF\n" +
//            "V8gwOuFxZC04YBArDsJILoqf5rorieDj3b69+0M8tykVq1Ba6scrFKvVjq0WGWVh\n" +
//            "MNjPsU2flqh9LeUXwGjBIyHDVUExKAzF8atXqDla1eHnlWHvZqdKPn3RQZ4WJZ6z\n" +
//            "gsNbEfPvKxZBKxUsygDpqE/4PhVnkzqNodUNOqr6giD8VUAc/7KDBiOOG8Ess2Tx\n" +
//            "V9PaM0A=\n" +
//            "-----END CERTIFICATE-----\n" +
//            "</cert>\n" +
//            "\n" +
//            "<key>\n" +
//            "-----BEGIN PRIVATE KEY-----\n" +
//            "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDnGixyE39mCWfl\n" +
//            "zMAY/TWuLilHaAl4rTixFfNIwW/dr9qPSaX6yH8twUJ7Hw6lEfkOfDMHRGFyNXBA\n" +
//            "yd3M8hAKtjQ1gfnZj56Jj8k2ukWMlFg+rNvLVRNUS9Tp+60AXorpogtW6NdTxXut\n" +
//            "0lJAHrBmQGwQ5mXbTd383659Ewp8G/W7nj2TGtB1Sab6luNfniqeNVbBv/0Ia2pR\n" +
//            "0kGKM8yGxHz8L5tuvqS20JphG8BwDD3upLH+56lMLUBID57tFPgqF6OuH1gs3nSn\n" +
//            "/qBYnil8u73qZKcN5wb99+SclFRdes2DwYcwt/xHUn/rOmIosRB69U89NxaAhLK2\n" +
//            "UHaj6SHVAgMBAAECggEBAK4GmKeCpTHqLVHv4EwxCOZUHoOGBXPZRVKcy+niuGGA\n" +
//            "1h2GgTWbG6IR4QUj+vw0z46n2ilDxfmh4hj3qk11jrzyPdh5OvMo4mKGYygSFuNo\n" +
//            "phb0RkMUmoyk2f0kpz8a8pJCkzVr+xI7KQpY0dU1BvLI2lfTl6oQNfUBX70RxJh1\n" +
//            "auqZRnzyS7Yf81IjptYZsvThkQK4sTAbt3ifrc/WRnfb9seXedF3iUDsNp3Tje/Y\n" +
//            "uC6SwPcggaW+QXfUI85SVYtPn6r92UrrSFz6PD0JAOEw0y7pX1jxRXy0R1Wqno0C\n" +
//            "ZpAJlj+noMKcDSIlzElZB8k+KNWPK++1ak1fNObHhSECgYEA/dLNXznUFQKe08D1\n" +
//            "9cdNlAYmXV6ZJNkkYBEfIPiKdhwQu2cjFMl5iqb7JeKGgWW/TaEpCmYQP9P/XwcZ\n" +
//            "52TO2XX5Q0mdHbRYZrQMP/UoHwGEvQP5CYu7ZH3YLVRousiuWDn0Sh6xKz4xmxr3\n" +
//            "jnUGpsNROVIs4/eI9YEIazw3yqkCgYEA6RV+TnjFC6b6ZCnz4PxhflRvCKL2b8+4\n" +
//            "3386Hr2JFMaOpIfAoheQ1UaEKAnGFhGQiN72SnA44hQsU+oBskUc4Evwy6nXA4xs\n" +
//            "qTqpni25ahkvqqwknBc4U3DD8lhcNueRZxFKRxdRfxRsGzOf7p+RfLTtouqb+B8F\n" +
//            "GNPwQgcY5U0CgYA3cRMw6KW9jRv6LtzKuaTlX06D+ITE+rUqUrMU9ZTw5YJ2HLoZ\n" +
//            "8UQeGAklpkww+XOG1lvrjI2iE4FlVVzAIVHZSB6RJwQtl9XzYQKH+dmwpBlFXBfK\n" +
//            "kP32nlJY3GYf3nPOi6Ijin6yblxRf9tw/3jbdjBIr/1kMg51aaDYI4ggOQKBgQC4\n" +
//            "B2BSVMg/CvdnXjhPyvSu6btA9mncngU5cRpSaxNwc9Tr0sMlN7YCrkpp0k2z3upf\n" +
//            "JqsO2swOtB7Lolb0idziuxLDurUo+BZTBx4k5bUfMAOSnZfKJgsy1jXfgiRMtUj4\n" +
//            "N46N0rtlupogYAJGRXZ5H+EAYHwEy3kawTtQ5omhgQKBgBRvsSvaXKCkTSsvc5GE\n" +
//            "idzCSuMRwD8C2hpReMH9zF5TDYm1mmE7bNQUZx6RWYefTFh8tf7B66Jkcx0Lb5eL\n" +
//            "Tf12AqDH63nrXJMpp8GjDsRfnUIA1MTKRGIHqXkNsVfWq0HVAgk8ae6vBb38xvWn\n" +
//            "qkeUsWh/59rtR688JAHu0Onb\n" +
//            "-----END PRIVATE KEY-----\n" +
//            "</key>\n" +
//            "\n" +
//            "ns-cert-type server\n" +
//            "comp-lzo\n" +
//            "verb 3\n";
}
