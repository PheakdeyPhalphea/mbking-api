package co.istad.mbanking.features.auth;

import co.istad.mbanking.features.auth.dto.AuthResponse;
import co.istad.mbanking.features.auth.dto.LoginRequest;
import co.istad.mbanking.features.auth.dto.RefreshTokenRequest;

public interface AuthService {
    AuthResponse refresh(RefreshTokenRequest tokenRequest);

    AuthResponse login(LoginRequest loginRequest);
}
