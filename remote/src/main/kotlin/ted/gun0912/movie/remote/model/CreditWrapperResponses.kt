package ted.gun0912.movie.remote.model

import com.google.gson.annotations.SerializedName

data class CreditWrapperResponses(
    @SerializedName("cast")
    val cast: List<CreditResponses>,
)
