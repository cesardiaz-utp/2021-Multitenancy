import httpClient from "./httpClient";

const END_POINT = "/api/cars";

const listarCarros = () => {
    return httpClient.get(END_POINT, {
        headers: {
            "X-tenant": sessionStorage.getItem("tenant")
        }
    });
};

const crearCarro = (carro) => {
    return httpClient.post(END_POINT, carro, {
        headers: {
            "X-tenant": sessionStorage.getItem("tenant")
        }
    });
};

export {
    listarCarros,
    crearCarro
}